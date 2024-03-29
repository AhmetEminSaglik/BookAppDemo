package com.ahmeteminsaglik.neo4jsocialmedya.business;

import com.ahmeteminsaglik.neo4jsocialmedya.model.User;

import java.util.ArrayList;
import java.util.List;

public class StaticData {
    private static List<User> userList = new ArrayList<>();
    private static User[][] userRelationArr;//= new User[456][2];

    public static List<User> getUserList() {
        if (userList.isEmpty()) {
            userList.add(new User(-1l, "Elizabeth", "Jessica", "user0", "pass", 10, 10));
            userList.add(new User(-1l, "Elizabeth", "Jessica", "user0", "pass", 44, 4));
            userList.add(new User(-1l, "Michael", "Donna", "user1", "pass", 97, 67));
            userList.add(new User(-1l, "Mary", "Michael", "user2", "pass", 42, 69));
            userList.add(new User(-1l, "James", "Charles", "user3", "pass", 69, 41));
            userList.add(new User(-1l, "Thomas", "Sarah", "user4", "pass", 95, 10));
            userList.add(new User(-1l, "Donna", "Paul", "user5", "pass", 7, 32));
            userList.add(new User(-1l, "William", "Donna", "user6", "pass", 43, 46));
            userList.add(new User(-1l, "Jennifer", "Margaret", "user7", "pass", 49, 15));
            userList.add(new User(-1l, "Andrew", "Daniel", "user8", "pass", 22, 12));
            userList.add(new User(-1l, "Steven", "Daniel", "user9", "pass", 89, 88));
            userList.add(new User(-1l, "Paul", "David", "user10", "pass", 83, 37));
            userList.add(new User(-1l, "Michelle", "Mark", "user11", "pass", 94, 17));
            userList.add(new User(-1l, "Kimberly", "Mary", "user12", "pass", 13, 48));
            userList.add(new User(-1l, "Patricia", "Elizabeth", "user13", "pass", 86, 0));
            userList.add(new User(-1l, "Mary", "Michael", "user14", "pass", 57, 68));
            userList.add(new User(-1l, "Ashley", "Karen", "user15", "pass", 86, 86));
            userList.add(new User(-1l, "Matthew", "Michael", "user16", "pass", 60, 57));
            userList.add(new User(-1l, "Barbara", "Karen", "user17", "pass", 97, 9));
            userList.add(new User(-1l, "Daniel", "Susan", "user18", "pass", 61, 8));
            userList.add(new User(-1l, "Matthew", "Mark", "user19", "pass", 34, 68));
            userList.add(new User(-1l, "John", "William", "user20", "pass", 93, 20));
            userList.add(new User(-1l, "Betty", "Matthew", "user21", "pass", 34, 0));
            userList.add(new User(-1l, "Kimberly", "Margaret", "user22", "pass", 26, 90));
            userList.add(new User(-1l, "Thomas", "Elizabeth", "user23", "pass", 24, 85));
            userList.add(new User(-1l, "Margaret", "Mark", "user24", "pass", 37, 2));
            userList.add(new User(-1l, "Andrew", "Jennifer", "user25", "pass", 65, 93));
            userList.add(new User(-1l, "Thomas", "Nancy", "user26", "pass", 63, 28));
            userList.add(new User(-1l, "Michelle", "William", "user27", "pass", 75, 61));
            userList.add(new User(-1l, "John", "Sarah", "user28", "pass", 98, 51));
            userList.add(new User(-1l, "Amanda", "Barbara", "user29", "pass", 34, 19));
        }
        return userList;
    }

    static int counter = 0;

    static void addRelationToArr(User user1, User user2) {
        userRelationArr[counter][0] = user1;
        userRelationArr[counter][1] = user2;
        counter++;
    }

    public static User[][] getRelationArr() {
        if (userRelationArr == null) {
            userRelationArr = new User[465][2];

            addRelationToArr(userList.get(1), userList.get(24));//"(u1)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(1), userList.get(25));//  "(u1)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(1), userList.get(7));//  "(u1)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(1), userList.get(8));//  "(u1)-[:FOLLOW]->(u8),\n" +
            addRelationToArr(userList.get(1), userList.get(26));//  "(u1)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(1), userList.get(17));//  "(u1)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(1), userList.get(21));//  "(u1)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(1), userList.get(29));//  "(u1)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(1), userList.get(5));//  "(u1)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(1), userList.get(22));//  "(u1)-[:FOLLOW]->(u22),\n" +
            addRelationToArr(userList.get(1), userList.get(6));//  "(u1)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(1), userList.get(3));//  "(u1)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(1), userList.get(28));//  "(u1)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(1), userList.get(2));//  "(u1)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(1), userList.get(18));//  "(u1)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(1), userList.get(12));//  "(u1)-[:FOLLOW]->(u12),\n" +
            addRelationToArr(userList.get(1), userList.get(9));//  "(u1)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(1), userList.get(10));//  "(u1)-[:FOLLOW]->(u10),\n" +
            addRelationToArr(userList.get(1), userList.get(15));//  "(u1)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(1), userList.get(19));//  "(u1)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(1), userList.get(0));//  "(u1)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(1), userList.get(20));//  "(u1)-[:FOLLOW]->(u20),\n" +
            addRelationToArr(userList.get(1), userList.get(11));//  "(u1)-[:FOLLOW]->(u11),\n" +
            addRelationToArr(userList.get(1), userList.get(23));//  "(u1)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(1), userList.get(27));//  "(u1)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(1), userList.get(4));//  "(u1)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(1), userList.get(13));//  "(u1)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(1), userList.get(16));//  "(u1)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(2), userList.get(23));//  "(u2)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(2), userList.get(27));//  "(u2)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(3), userList.get(16));//  "(u3)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(3), userList.get(9));//  "(u3)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(3), userList.get(1));//  "(u3)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(3), userList.get(18));//  "(u3)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(3), userList.get(6));//  "(u3)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(3), userList.get(19));//  "(u3)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(3), userList.get(20));//  "(u3)-[:FOLLOW]->(u20),\n" +
            addRelationToArr(userList.get(3), userList.get(12));//  "(u3)-[:FOLLOW]->(u12),\n" +
            addRelationToArr(userList.get(3), userList.get(25));//  "(u3)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(3), userList.get(13));//  "(u3)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(3), userList.get(14));//  "(u3)-[:FOLLOW]->(u14),\n" +
            addRelationToArr(userList.get(3), userList.get(11));//  "(u3)-[:FOLLOW]->(u11),\n" +
            addRelationToArr(userList.get(3), userList.get(26));//  "(u3)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(3), userList.get(21));//  "(u3)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(3), userList.get(2));//  "(u3)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(3), userList.get(0));//  "(u3)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(3), userList.get(4));//  "(u3)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(3), userList.get(23));//  "(u3)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(3), userList.get(28));//  "(u3)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(3), userList.get(5));//  "(u3)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(3), userList.get(22));//  "(u3)-[:FOLLOW]->(u22),\n" +
            addRelationToArr(userList.get(3), userList.get(7));//  "(u3)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(3), userList.get(8));//  "(u3)-[:FOLLOW]->(u8),\n" +
            addRelationToArr(userList.get(4), userList.get(2));//  "(u4)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(4), userList.get(6));//  "(u4)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(4), userList.get(0));//  "(u4)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(4), userList.get(3));//  "(u4)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(4), userList.get(16));//  "(u4)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(4), userList.get(29));//  "(u4)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(4), userList.get(7));//  "(u4)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(4), userList.get(12));//  "(u4)-[:FOLLOW]->(u12),\n" +
            addRelationToArr(userList.get(4), userList.get(19));//  "(u4)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(4), userList.get(18));//  "(u4)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(4), userList.get(25));//  "(u4)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(4), userList.get(26));//  "(u4)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(4), userList.get(22));//  "(u4)-[:FOLLOW]->(u22),\n" +
            addRelationToArr(userList.get(4), userList.get(1));//  "(u4)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(4), userList.get(27));//  "(u4)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(4), userList.get(28));//  "(u4)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(4), userList.get(24));//  "(u4)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(4), userList.get(9));//  "(u4)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(4), userList.get(15));//  "(u4)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(4), userList.get(8));//  "(u4)-[:FOLLOW]->(u8),\n" +
            addRelationToArr(userList.get(4), userList.get(21));//  "(u4)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(4), userList.get(23));//  "(u4)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(4), userList.get(10));//  "(u4)-[:FOLLOW]->(u10),\n" +
            addRelationToArr(userList.get(4), userList.get(5));//  "(u4)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(5), userList.get(22));//  "(u5)-[:FOLLOW]->(u22),\n" +
            addRelationToArr(userList.get(5), userList.get(23));//  "(u5)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(5), userList.get(20));//  "(u5)-[:FOLLOW]->(u20),\n" +
            addRelationToArr(userList.get(5), userList.get(8));//  "(u5)-[:FOLLOW]->(u8),\n" +
            addRelationToArr(userList.get(5), userList.get(26));//  "(u5)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(5), userList.get(10));//  "(u5)-[:FOLLOW]->(u10),\n" +
            addRelationToArr(userList.get(5), userList.get(9));//  "(u5)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(5), userList.get(6));//  "(u5)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(5), userList.get(27));//  "(u5)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(5), userList.get(17));//  "(u5)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(5), userList.get(15));//  "(u5)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(5), userList.get(4));//  "(u5)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(5), userList.get(7));//  "(u5)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(6), userList.get(19));//  "(u6)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(6), userList.get(13));//  "(u6)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(6), userList.get(17));//  "(u6)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(6), userList.get(12));//  "(u6)-[:FOLLOW]->(u12),\n" +
            addRelationToArr(userList.get(6), userList.get(29));//  "(u6)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(6), userList.get(25));//  "(u6)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(6), userList.get(15));//  "(u6)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(7), userList.get(16));//  "(u7)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(7), userList.get(6));//  "(u7)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(7), userList.get(13));//  "(u7)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(7), userList.get(0));//  "(u7)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(7), userList.get(14));//  "(u7)-[:FOLLOW]->(u14),\n" +
            addRelationToArr(userList.get(7), userList.get(19));//  "(u7)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(7), userList.get(2));//  "(u7)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(7), userList.get(17));//  "(u7)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(7), userList.get(26));//  "(u7)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(7), userList.get(11));//  "(u7)-[:FOLLOW]->(u11),\n" +
            addRelationToArr(userList.get(7), userList.get(8));//  "(u7)-[:FOLLOW]->(u8),\n" +
            addRelationToArr(userList.get(7), userList.get(1));//  "(u7)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(7), userList.get(18));//  "(u7)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(7), userList.get(29));//  "(u7)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(7), userList.get(3));//  "(u7)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(7), userList.get(22));//  "(u7)-[:FOLLOW]->(u22),\n" +
            addRelationToArr(userList.get(7), userList.get(4));//  "(u7)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(7), userList.get(5));//  "(u7)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(7), userList.get(20));//  "(u7)-[:FOLLOW]->(u20),\n" +
            addRelationToArr(userList.get(7), userList.get(21));//  "(u7)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(7), userList.get(9));//  "(u7)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(7), userList.get(12));//  "(u7)-[:FOLLOW]->(u12),\n" +
            addRelationToArr(userList.get(7), userList.get(28));//  "(u7)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(7), userList.get(10));//  "(u7)-[:FOLLOW]->(u10),\n" +
            addRelationToArr(userList.get(7), userList.get(15));//  "(u7)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(7), userList.get(23));//  "(u7)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(7), userList.get(27));//  "(u7)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(7), userList.get(24));//  "(u7)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(8), userList.get(7));//  "(u8)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(8), userList.get(29));//  "(u8)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(8), userList.get(1));//  "(u8)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(8), userList.get(17));//  "(u8)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(8), userList.get(23));//  "(u8)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(8), userList.get(9));//  "(u8)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(9), userList.get(4));//  "(u9)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(9), userList.get(23));//  "(u9)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(9), userList.get(27));//  "(u9)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(10), userList.get(9));//  "(u10)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(10), userList.get(11));//  "(u10)-[:FOLLOW]->(u11),\n" +
            addRelationToArr(userList.get(10), userList.get(15));//  "(u10)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(10), userList.get(14));//  "(u10)-[:FOLLOW]->(u14),\n" +
            addRelationToArr(userList.get(10), userList.get(16));//  "(u10)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(10), userList.get(22));//  "(u10)-[:FOLLOW]->(u22),\n" +
            addRelationToArr(userList.get(10), userList.get(28));//  "(u10)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(10), userList.get(4));//  "(u10)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(10), userList.get(23));//  "(u10)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(10), userList.get(17));//  "(u10)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(10), userList.get(12));//  "(u10)-[:FOLLOW]->(u12),\n" +
            addRelationToArr(userList.get(10), userList.get(18));//  "(u10)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(10), userList.get(7));//  "(u10)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(10), userList.get(26));//  "(u10)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(10), userList.get(27));//  "(u10)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(10), userList.get(29));//  "(u10)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(10), userList.get(2));//  "(u10)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(10), userList.get(0));//  "(u10)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(10), userList.get(13));//  "(u10)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(10), userList.get(19));//  "(u10)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(10), userList.get(20));//  "(u10)-[:FOLLOW]->(u20),\n" +
            addRelationToArr(userList.get(10), userList.get(21));//  "(u10)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(11), userList.get(27));//  "(u11)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(11), userList.get(26));//  "(u11)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(11), userList.get(10));//  "(u11)-[:FOLLOW]->(u10),\n" +
            addRelationToArr(userList.get(11), userList.get(20));//  "(u11)-[:FOLLOW]->(u20),\n" +
            addRelationToArr(userList.get(11), userList.get(2));//  "(u11)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(11), userList.get(12));//  "(u11)-[:FOLLOW]->(u12),\n" +
            addRelationToArr(userList.get(11), userList.get(24));//  "(u11)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(11), userList.get(18));//  "(u11)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(11), userList.get(0));//  "(u11)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(11), userList.get(13));//  "(u11)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(11), userList.get(4));//  "(u11)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(11), userList.get(17));//  "(u11)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(11), userList.get(25));//  "(u11)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(11), userList.get(19));//  "(u11)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(11), userList.get(7));//  "(u11)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(12), userList.get(3));//  "(u12)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(12), userList.get(27));//  "(u12)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(12), userList.get(5));//  "(u12)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(12), userList.get(16));//  "(u12)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(12), userList.get(23));//  "(u12)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(12), userList.get(7));//  "(u12)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(12), userList.get(15));//  "(u12)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(12), userList.get(6));//  "(u12)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(12), userList.get(8));//  "(u12)-[:FOLLOW]->(u8),\n" +
            addRelationToArr(userList.get(12), userList.get(28));//  "(u12)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(12), userList.get(14));//  "(u12)-[:FOLLOW]->(u14),\n" +
            addRelationToArr(userList.get(12), userList.get(4));//  "(u12)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(12), userList.get(29));//  "(u12)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(12), userList.get(22));//  "(u12)-[:FOLLOW]->(u22),\n" +
            addRelationToArr(userList.get(12), userList.get(0));//  "(u12)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(12), userList.get(1));//  "(u12)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(12), userList.get(18));//  "(u12)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(12), userList.get(9));//  "(u12)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(12), userList.get(17));//  "(u12)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(12), userList.get(11));//  "(u12)-[:FOLLOW]->(u11),\n" +
            addRelationToArr(userList.get(12), userList.get(19));//  "(u12)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(12), userList.get(24));//  "(u12)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(12), userList.get(13));//  "(u12)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(12), userList.get(2));//  "(u12)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(12), userList.get(20));//  "(u12)-[:FOLLOW]->(u20),\n" +
            addRelationToArr(userList.get(12), userList.get(10));//  "(u12)-[:FOLLOW]->(u10),\n" +
            addRelationToArr(userList.get(12), userList.get(21));//  "(u12)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(12), userList.get(25));//  "(u12)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(13), userList.get(21));//  "(u13)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(14), userList.get(5));//  "(u14)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(14), userList.get(20));//  "(u14)-[:FOLLOW]->(u20),\n" +
            addRelationToArr(userList.get(14), userList.get(21));//  "(u14)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(14), userList.get(15));//  "(u14)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(14), userList.get(16));//  "(u14)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(14), userList.get(23));//  "(u14)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(14), userList.get(6));//  "(u14)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(14), userList.get(26));//  "(u14)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(14), userList.get(13));//  "(u14)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(14), userList.get(24));//  "(u14)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(14), userList.get(25));//  "(u14)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(14), userList.get(1));//  "(u14)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(14), userList.get(12));//  "(u14)-[:FOLLOW]->(u12),\n" +
            addRelationToArr(userList.get(14), userList.get(17));//  "(u14)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(14), userList.get(29));//  "(u14)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(14), userList.get(22));//  "(u14)-[:FOLLOW]->(u22),\n" +
            addRelationToArr(userList.get(15), userList.get(17));//  "(u15)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(15), userList.get(29));//  "(u15)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(15), userList.get(2));//  "(u15)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(15), userList.get(5));//  "(u15)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(15), userList.get(4));//  "(u15)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(15), userList.get(22));//  "(u15)-[:FOLLOW]->(u22),\n" +
            addRelationToArr(userList.get(15), userList.get(11));//  "(u15)-[:FOLLOW]->(u11),\n" +
            addRelationToArr(userList.get(15), userList.get(23));//  "(u15)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(15), userList.get(21));//  "(u15)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(15), userList.get(13));//  "(u15)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(15), userList.get(25));//  "(u15)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(15), userList.get(9));//  "(u15)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(15), userList.get(3));//  "(u15)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(15), userList.get(28));//  "(u15)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(15), userList.get(1));//  "(u15)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(15), userList.get(24));//  "(u15)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(15), userList.get(0));//  "(u15)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(15), userList.get(18));//  "(u15)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(16), userList.get(12));//  "(u16)-[:FOLLOW]->(u12),\n" +
            addRelationToArr(userList.get(16), userList.get(1));//  "(u16)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(16), userList.get(11));//  "(u16)-[:FOLLOW]->(u11),\n" +
            addRelationToArr(userList.get(16), userList.get(4));//  "(u16)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(16), userList.get(9));//  "(u16)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(16), userList.get(17));//  "(u16)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(16), userList.get(2));//  "(u16)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(16), userList.get(19));//  "(u16)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(16), userList.get(3));//  "(u16)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(16), userList.get(23));//  "(u16)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(16), userList.get(5));//  "(u16)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(16), userList.get(24));//  "(u16)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(16), userList.get(7));//  "(u16)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(16), userList.get(18));//  "(u16)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(16), userList.get(6));//  "(u16)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(16), userList.get(25));//  "(u16)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(16), userList.get(0));//  "(u16)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(17), userList.get(3));//  "(u17)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(17), userList.get(13));//  "(u17)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(17), userList.get(11));//  "(u17)-[:FOLLOW]->(u11),\n" +
            addRelationToArr(userList.get(17), userList.get(27));//  "(u17)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(17), userList.get(8));//  "(u17)-[:FOLLOW]->(u8),\n" +
            addRelationToArr(userList.get(17), userList.get(28));//  "(u17)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(17), userList.get(21));//  "(u17)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(17), userList.get(14));//  "(u17)-[:FOLLOW]->(u14),\n" +
            addRelationToArr(userList.get(17), userList.get(9));//  "(u17)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(17), userList.get(10));//  "(u17)-[:FOLLOW]->(u10),\n" +
            addRelationToArr(userList.get(17), userList.get(15));//  "(u17)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(17), userList.get(12));//  "(u17)-[:FOLLOW]->(u12),\n" +
            addRelationToArr(userList.get(17), userList.get(25));//  "(u17)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(17), userList.get(29));//  "(u17)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(17), userList.get(16));//  "(u17)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(17), userList.get(5));//  "(u17)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(17), userList.get(1));//  "(u17)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(17), userList.get(26));//  "(u17)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(17), userList.get(20));//  "(u17)-[:FOLLOW]->(u20),\n" +
            addRelationToArr(userList.get(17), userList.get(23));//  "(u17)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(17), userList.get(4));//  "(u17)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(17), userList.get(18));//  "(u17)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(17), userList.get(19));//  "(u17)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(17), userList.get(6));//  "(u17)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(17), userList.get(22));//  "(u17)-[:FOLLOW]->(u22),\n" +
            addRelationToArr(userList.get(17), userList.get(2));//  "(u17)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(17), userList.get(24));//  "(u17)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(17), userList.get(0));//  "(u17)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(18), userList.get(24));//  "(u18)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(18), userList.get(19));//  "(u18)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(18), userList.get(16));//  "(u18)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(18), userList.get(2));//  "(u18)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(18), userList.get(28));//  "(u18)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(18), userList.get(23));//  "(u18)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(19), userList.get(9));//  "(u19)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(19), userList.get(6));//  "(u19)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(19), userList.get(23));//  "(u19)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(19), userList.get(20));//  "(u19)-[:FOLLOW]->(u20),\n" +
            addRelationToArr(userList.get(19), userList.get(1));//  "(u19)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(19), userList.get(21));//  "(u19)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(19), userList.get(4));//  "(u19)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(19), userList.get(2));//  "(u19)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(20), userList.get(9));//  "(u20)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(20), userList.get(17));//  "(u20)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(20), userList.get(23));//  "(u20)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(20), userList.get(18));//  "(u20)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(20), userList.get(26));//  "(u20)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(20), userList.get(6));//  "(u20)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(20), userList.get(0));//  "(u20)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(20), userList.get(2));//  "(u20)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(20), userList.get(7));//  "(u20)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(20), userList.get(27));//  "(u20)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(20), userList.get(28));//  "(u20)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(20), userList.get(29));//  "(u20)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(20), userList.get(14));//  "(u20)-[:FOLLOW]->(u14),\n" +
            addRelationToArr(userList.get(20), userList.get(24));//  "(u20)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(20), userList.get(1));//  "(u20)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(20), userList.get(4));//  "(u20)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(20), userList.get(3));//  "(u20)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(21), userList.get(8));//  "(u21)-[:FOLLOW]->(u8),\n" +
            addRelationToArr(userList.get(21), userList.get(4));//  "(u21)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(21), userList.get(5));//  "(u21)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(21), userList.get(0));//  "(u21)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(21), userList.get(29));//  "(u21)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(21), userList.get(25));//  "(u21)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(21), userList.get(6));//  "(u21)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(21), userList.get(27));//  "(u21)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(21), userList.get(11));//  "(u21)-[:FOLLOW]->(u11),\n" +
            addRelationToArr(userList.get(21), userList.get(22));//  "(u21)-[:FOLLOW]->(u22),\n" +
            addRelationToArr(userList.get(21), userList.get(15));//  "(u21)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(21), userList.get(20));//  "(u21)-[:FOLLOW]->(u20),\n" +
            addRelationToArr(userList.get(21), userList.get(16));//  "(u21)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(21), userList.get(7));//  "(u21)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(21), userList.get(3));//  "(u21)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(21), userList.get(9));//  "(u21)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(21), userList.get(10));//  "(u21)-[:FOLLOW]->(u10),\n" +
            addRelationToArr(userList.get(21), userList.get(1));//  "(u21)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(21), userList.get(17));//  "(u21)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(21), userList.get(23));//  "(u21)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(21), userList.get(18));//  "(u21)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(21), userList.get(12));//  "(u21)-[:FOLLOW]->(u12),\n" +
            addRelationToArr(userList.get(22), userList.get(25));//  "(u22)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(22), userList.get(14));//  "(u22)-[:FOLLOW]->(u14),\n" +
            addRelationToArr(userList.get(22), userList.get(21));//  "(u22)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(22), userList.get(5));//  "(u22)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(23), userList.get(24));//  "(u23)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(23), userList.get(2));//  "(u23)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(23), userList.get(25));//  "(u23)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(23), userList.get(14));//  "(u23)-[:FOLLOW]->(u14),\n" +
            addRelationToArr(userList.get(23), userList.get(6));//  "(u23)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(23), userList.get(0));//  "(u23)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(23), userList.get(5));//  "(u23)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(23), userList.get(15));//  "(u23)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(23), userList.get(17));//  "(u23)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(23), userList.get(27));//  "(u23)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(23), userList.get(28));//  "(u23)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(23), userList.get(13));//  "(u23)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(23), userList.get(3));//  "(u23)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(23), userList.get(9));//  "(u23)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(23), userList.get(10));//  "(u23)-[:FOLLOW]->(u10),\n" +
            addRelationToArr(userList.get(23), userList.get(21));//  "(u23)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(23), userList.get(7));//  "(u23)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(23), userList.get(1));//  "(u23)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(23), userList.get(18));//  "(u23)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(23), userList.get(16));//  "(u23)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(23), userList.get(8));//  "(u23)-[:FOLLOW]->(u8),\n" +
            addRelationToArr(userList.get(24), userList.get(14));//  "(u24)-[:FOLLOW]->(u14),\n" +
            addRelationToArr(userList.get(24), userList.get(29));//  "(u24)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(24), userList.get(15));//  "(u24)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(24), userList.get(23));//  "(u24)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(24), userList.get(5));//  "(u24)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(24), userList.get(0));//  "(u24)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(24), userList.get(26));//  "(u24)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(24), userList.get(27));//  "(u24)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(24), userList.get(8));//  "(u24)-[:FOLLOW]->(u8),\n" +
            addRelationToArr(userList.get(24), userList.get(16));//  "(u24)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(24), userList.get(4));//  "(u24)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(24), userList.get(22));//  "(u24)-[:FOLLOW]->(u22),\n" +
            addRelationToArr(userList.get(24), userList.get(7));//  "(u24)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(24), userList.get(13));//  "(u24)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(24), userList.get(25));//  "(u24)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(24), userList.get(21));//  "(u24)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(24), userList.get(19));//  "(u24)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(24), userList.get(28));//  "(u24)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(24), userList.get(6));//  "(u24)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(24), userList.get(9));//  "(u24)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(24), userList.get(1));//  "(u24)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(24), userList.get(2));//  "(u24)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(24), userList.get(3));//  "(u24)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(24), userList.get(10));//  "(u24)-[:FOLLOW]->(u10),\n" +
            addRelationToArr(userList.get(24), userList.get(17));//  "(u24)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(24), userList.get(11));//  "(u24)-[:FOLLOW]->(u11),\n" +
            addRelationToArr(userList.get(25), userList.get(0));//  "(u25)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(25), userList.get(13));//  "(u25)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(25), userList.get(15));//  "(u25)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(25), userList.get(16));//  "(u25)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(25), userList.get(17));//  "(u25)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(25), userList.get(27));//  "(u25)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(25), userList.get(28));//  "(u25)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(25), userList.get(23));//  "(u25)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(25), userList.get(26));//  "(u25)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(25), userList.get(29));//  "(u25)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(25), userList.get(11));//  "(u25)-[:FOLLOW]->(u11),\n" +
            addRelationToArr(userList.get(25), userList.get(9));//  "(u25)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(25), userList.get(8));//  "(u25)-[:FOLLOW]->(u8),\n" +
            addRelationToArr(userList.get(25), userList.get(18));//  "(u25)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(25), userList.get(10));//  "(u25)-[:FOLLOW]->(u10),\n" +
            addRelationToArr(userList.get(26), userList.get(16));//  "(u26)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(26), userList.get(1));//  "(u26)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(26), userList.get(2));//  "(u26)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(26), userList.get(24));//  "(u26)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(26), userList.get(27));//  "(u26)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(26), userList.get(3));//  "(u26)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(26), userList.get(9));//  "(u26)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(26), userList.get(21));//  "(u26)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(27), userList.get(7));//  "(u27)-[:FOLLOW]->(u7),\n" +
            addRelationToArr(userList.get(27), userList.get(6));//  "(u27)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(27), userList.get(8));//  "(u27)-[:FOLLOW]->(u8),\n" +
            addRelationToArr(userList.get(27), userList.get(28));//  "(u27)-[:FOLLOW]->(u28),\n" +
            addRelationToArr(userList.get(27), userList.get(25));//  "(u27)-[:FOLLOW]->(u25),\n" +
            addRelationToArr(userList.get(27), userList.get(15));//  "(u27)-[:FOLLOW]->(u15),\n" +
            addRelationToArr(userList.get(27), userList.get(12));//  "(u27)-[:FOLLOW]->(u12),\n" +
            addRelationToArr(userList.get(27), userList.get(26));//  "(u27)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(27), userList.get(13));//  "(u27)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(27), userList.get(24));//  "(u27)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(27), userList.get(19));//  "(u27)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(27), userList.get(5));//  "(u27)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(27), userList.get(29));//  "(u27)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(27), userList.get(0));//  "(u27)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(27), userList.get(9));//  "(u27)-[:FOLLOW]->(u9),\n" +
            addRelationToArr(userList.get(27), userList.get(1));//  "(u27)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(27), userList.get(18));//  "(u27)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(27), userList.get(17));//  "(u27)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(27), userList.get(14));//  "(u27)-[:FOLLOW]->(u14),\n" +
            addRelationToArr(userList.get(27), userList.get(2));//  "(u27)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(27), userList.get(3));//  "(u27)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(27), userList.get(10));//  "(u27)-[:FOLLOW]->(u10),\n" +
            addRelationToArr(userList.get(28), userList.get(18));//  "(u28)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(28), userList.get(19));//  "(u28)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(28), userList.get(26));//  "(u28)-[:FOLLOW]->(u26),\n" +
            addRelationToArr(userList.get(28), userList.get(8));//  "(u28)-[:FOLLOW]->(u8),\n" +
            addRelationToArr(userList.get(28), userList.get(21));//  "(u28)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(28), userList.get(3));//  "(u28)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(28), userList.get(6));//  "(u28)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(28), userList.get(20));//  "(u28)-[:FOLLOW]->(u20),\n" +
            addRelationToArr(userList.get(28), userList.get(16));//  "(u28)-[:FOLLOW]->(u16),\n" +
            addRelationToArr(userList.get(28), userList.get(13));//  "(u28)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(28), userList.get(0));//  "(u28)-[:FOLLOW]->(u0),\n" +
            addRelationToArr(userList.get(28), userList.get(27));//  "(u28)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(28), userList.get(2));//  "(u28)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(28), userList.get(11));//  "(u28)-[:FOLLOW]->(u11),\n" +
            addRelationToArr(userList.get(28), userList.get(29));//  "(u28)-[:FOLLOW]->(u29),\n" +
            addRelationToArr(userList.get(28), userList.get(4));//  "(u28)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(28), userList.get(14));//  "(u28)-[:FOLLOW]->(u14),\n" +
            addRelationToArr(userList.get(29), userList.get(17));//  "(u29)-[:FOLLOW]->(u17),\n" +
            addRelationToArr(userList.get(29), userList.get(13));//  "(u29)-[:FOLLOW]->(u13),\n" +
            addRelationToArr(userList.get(29), userList.get(5));//  "(u29)-[:FOLLOW]->(u5),\n" +
            addRelationToArr(userList.get(29), userList.get(22));//  "(u29)-[:FOLLOW]->(u22),\n" +
            addRelationToArr(userList.get(29), userList.get(4));//  "(u29)-[:FOLLOW]->(u4),\n" +
            addRelationToArr(userList.get(29), userList.get(18));//  "(u29)-[:FOLLOW]->(u18),\n" +
            addRelationToArr(userList.get(29), userList.get(1));//  "(u29)-[:FOLLOW]->(u1),\n" +
            addRelationToArr(userList.get(29), userList.get(2));//  "(u29)-[:FOLLOW]->(u2),\n" +
            addRelationToArr(userList.get(29), userList.get(3));//  "(u29)-[:FOLLOW]->(u3),\n" +
            addRelationToArr(userList.get(29), userList.get(12));//  "(u29)-[:FOLLOW]->(u12),\n" +
            addRelationToArr(userList.get(29), userList.get(27));//  "(u29)-[:FOLLOW]->(u27),\n" +
            addRelationToArr(userList.get(29), userList.get(21));//  "(u29)-[:FOLLOW]->(u21),\n" +
            addRelationToArr(userList.get(29), userList.get(23));//  "(u29)-[:FOLLOW]->(u23),\n" +
            addRelationToArr(userList.get(29), userList.get(19));//  "(u29)-[:FOLLOW]->(u19),\n" +
            addRelationToArr(userList.get(29), userList.get(14));//  "(u29)-[:FOLLOW]->(u14),\n" +
            addRelationToArr(userList.get(29), userList.get(6));//  "(u29)-[:FOLLOW]->(u6),\n" +
            addRelationToArr(userList.get(29), userList.get(11));//  "(u29)-[:FOLLOW]->(u11),\n" +
            addRelationToArr(userList.get(29), userList.get(20));//  "(u29)-[:FOLLOW]->(u20),\n" +
            addRelationToArr(userList.get(29), userList.get(24));//  "(u29)-[:FOLLOW]->(u24),\n" +
            addRelationToArr(userList.get(29), userList.get(0));//  "(u29)-[:FOLLOW]->(u0)\n";
        }
        return userRelationArr;
    }
}
