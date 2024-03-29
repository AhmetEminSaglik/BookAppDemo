import 'dart:convert';

import 'package:dio/dio.dart';
import 'package:flutter_book_app/repo/UserRepository.dart';
import 'package:flutter_book_app/util/SharedPrefUtils.dart';
import 'package:logger/logger.dart';
import '../model/User.dart';
import 'BaseHttpRequest.dart';
import 'Model/ResponseEntity.dart';
import 'package:http/http.dart' as http;

class HttpRequestUser {
  static const String _classUrl = "/users";
  static final String _baseUrl = BaseHttpRequestConfig.baseUrl + _classUrl;
  static var log = Logger(printer: PrettyPrinter(colors: false));

  static Future<ResponseEntity> login(String username, String password) async {
    String url = "$_baseUrl/login";
    log.i("URL : $url");
    Map<String, dynamic> requestData = {
      "username": username,
      "password": password,
    };
    var resp = await Dio().post(url, data: requestData);
    ResponseEntity respEntity = ResponseEntity.fromJson(resp.data);
    return respEntity;
  }

  static Future<List<User>> getRecommendUserList() async {
    List<User> userList = [];
    Uri url =
        Uri.parse("$_baseUrl/recommend/user/${SharedPrefUtils.getUserId()}");
    log.i("URL : $url");
    var resp = await http.get(url);
    Map<String, dynamic> jsonData = json.decode(resp.body);
    ResponseEntity respEntity = ResponseEntity.fromJson(jsonData);
    if (respEntity.success) {
      userList = UserRepository.parseUserList(respEntity.data);
    }
    return userList;
  }
}
