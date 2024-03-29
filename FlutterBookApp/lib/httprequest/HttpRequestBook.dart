import 'dart:convert';

import 'package:flutter_book_app/repo/BookRepository.dart';
import 'package:logger/logger.dart';

import '../model/Book.dart';
import '../util/SharedPrefUtils.dart';
import 'BaseHttpRequest.dart';
import 'package:http/http.dart' as http;

import 'Model/ResponseEntity.dart';

class HttpRequestBook {
  static const String _classUrl = "/books";
  static final String _baseUrl = BaseHttpRequestConfig.baseUrl + _classUrl;
  static var log = Logger(printer: PrettyPrinter(colors: false));

  static Future<List<Book>> getRecommendedBookListByPoint() async {
    List<Book> bookList = [];
    Uri url = Uri.parse("$_baseUrl/recommend/point");
    log.i("URL : $url");
    var resp = await http.get(url);
    Map<String, dynamic> jsonData = json.decode(resp.body);
    ResponseEntity respEntity = ResponseEntity.fromJson(jsonData);
    if (respEntity.success) {
      bookList = BookRepository.parseBookList(respEntity.data);
    }
    return bookList;
  }

  static Future<List<Book>> getRecommendedBookListByTotalRead() async {
    List<Book> bookList = [];
    Uri url = Uri.parse("$_baseUrl/recommend/totalread");
    log.i("URL : $url");
    var resp = await http.get(url);
    Map<String, dynamic> jsonData = json.decode(resp.body);
    ResponseEntity respEntity = ResponseEntity.fromJson(jsonData);
    if (respEntity.success) {
      bookList = BookRepository.parseBookList(respEntity.data);
    }
    return bookList;
  }

  static Future<List<Book>> getRecommendedBookListByFriendRead() async {
    List<Book> bookList = [];
    Uri url =
        Uri.parse("$_baseUrl/recommend/friend/${SharedPrefUtils.getUserId()}");
    log.i("URL : $url");
    var resp = await http.get(url);
    Map<String, dynamic> jsonData = json.decode(resp.body);
    ResponseEntity respEntity = ResponseEntity.fromJson(jsonData);
    if (respEntity.success) {
      bookList = BookRepository.parseBookList(respEntity.data);
    }
    return bookList;
  }
}
