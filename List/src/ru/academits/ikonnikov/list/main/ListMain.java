package ru.academits.ikonnikov.list.main;

import ru.academits.ikonnikov.list.MyList;

public class ListMain {
    public static void main(String[] args) {
        MyList<String> listEmpty = new MyList<>();
        System.out.println("The listEmpty is: " + listEmpty.toString());
        listEmpty.turn();
        System.out.println("The listEmpty after turning is: " + listEmpty.toString());
        System.out.println("The copy of listEmpty is: " + listEmpty.copy().toString());
        System.out.println("" + listEmpty.removeNodeByValue("d"));

        MyList<String> list = new MyList<>("Not");
        list.insertInHead("Good buy");
        list.insertByIndex(1, "Hello");
        list.insertByIndex(2, "null");
        list.insertByIndex(4,"Please");
        System.out.println("The list is: " + list.toString());

        System.out.println("The size of this list is: " + list.getLength());

        System.out.println("The data of head is: " + list.getHeadData());

        System.out.println("The data by index '1' is : " + list.getData(1));
        System.out.println("The data by index '3' before setting data 'Yes' is : " + list.setData(3, "Yes"));
        System.out.println("The list after setting data 'Yes' by index '3' is : " + list.toString());

        MyList<String> list1 = list.copy();
        System.out.println("The copy of list is: " + list1.toString());

        list.turn();
        System.out.println("The list after turning is : " + list.toString());

        System.out.println("The result of removing by data 'Good buy' is: " + list.removeNodeByValue("Good buy"));
        System.out.println("The list after removing by data 'Good buy' is :" + list.toString());

        System.out.println("The result of removing by data 'Please' is: " + list.removeNodeByValue("Please"));
        System.out.println("The list after removing by data 'Please' is : " + list.toString());

        System.out.println("The removing data by index '0' is: " + list.removeNode(0));
        System.out.println("The list after removing data by index '0' is : " + list.toString());

        System.out.println("The data of removing 'head' is: " + list.removeHead());
        System.out.println("The list after removing 'head' is : " + list.toString());

        list.insertByIndex(1,"null");
        System.out.println("The list after inserting 'null' by index '1' is : " + list.toString());

        System.out.println("The result of removing by data 'null' is: " + list.removeNodeByValue("null"));
        System.out.println("The list after removing by data 'null' is :" + list.toString());
        System.out.println("The copy of list is: " + list.copy().toString());
        list.turn();
        System.out.println("The list after turning is : " + list.toString());


    }
}
