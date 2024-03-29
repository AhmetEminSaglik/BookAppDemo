import '../model/Book.dart';

class BookRepository {
  static Book parseBook(Map<String, dynamic> json) {
    return Book.fromJson(json);
  }

  static List<Book> parseBookList(List<dynamic> json) {
    List<Book> bookList = [];
    print("-------JSON : $json");
    for (var tmp in json) {
      Book user = Book(
          id: tmp["id"],
          desc: tmp["description"],
          imgUrl: tmp["imgUrl"],
          isbn: tmp["isbn"],
          name: tmp["name"],
          point: tmp["point"],
          totalRead: tmp["totalRead"],
          webUrl: tmp["webUrl"]);
      bookList.add(user);
    }
    return bookList;
  }
}
