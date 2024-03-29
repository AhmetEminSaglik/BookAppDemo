class Author {
  late int _id;
  late String _key;
  late String _name;
  late String _lastname;
  late double _point;
  late int _totalBook;

  Author(
      {required id,
      required key,
      required name,
      required lastname,
      required point,
      required totalBook}) {
    _id = id;
    _key = key;
    _name = name;
    _lastname = lastname;
    _point = point;
    _totalBook = totalBook;
  }

  factory Author.fromJson(Map<String, dynamic> json) {
    return Author(
        id: json["id"] as String,
        key: json["key"] as String,
        name: json["name"] as String,
        lastname: json["lastname"] as String,
        point: json["point"] as double,
        totalBook: json["totalBook"] as int);
  }

  Map<String, dynamic> toJson() {
    return {
      "id": id,
      "key": key,
      "name": name,
      "lastname": lastname,
      "point": point,
      "totalBook": totalBook
    };
  }

  int get totalBook => _totalBook;

  set totalBook(int value) {
    _totalBook = value;
  }

  double get point => _point;

  set point(double value) {
    _point = value;
  }

  String get lastname => _lastname;

  set lastname(String value) {
    _lastname = value;
  }

  String get name => _name;

  set name(String value) {
    _name = value;
  }

  String get key => _key;

  set key(String value) {
    _key = value;
  }

  int get id => _id;

  @override
  String toString() {
    return 'Author{_id: $_id, _key: $_key, _name: $_name, _lastname: $_lastname, _point: $_point, _totalBook: $_totalBook}';
  }
}
