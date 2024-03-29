enum EnumUserProp {
  ID(name: "id"),
  NAME(name: "name"),
  LASTNAME(name: "lastname"),
  USERNAME(name: "username"),
  PASSWORD(name: "password"),
  TOTAL_FOLLOWERS(name: "totalFollowers"),
  TOTAL_FOLLOWED(name: "totalFollowed");

final String name;
const EnumUserProp({required this.name});
}
