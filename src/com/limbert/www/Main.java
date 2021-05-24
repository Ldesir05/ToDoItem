package com.limbert.www;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        //creating new ToDoList Object
        ToDoList todo=new ToDoList();
        int flag = 0;

        while(flag == 0){

            System.out.print("1.Add item\n2.Delete item\n3.List of todo Item\n4.exit\nEnter your choice:");
            Scanner input=new Scanner(System.in);
            //reading choice from user
            int option=input.nextInt(); input.nextLine();
            if(option == 1){
                System.out.println("Enter the item:");
                String item=input.nextLine();
                todo.addItem(item);
                System.out.println("1 item added!");
            }
            else if(option == 2){
                todo.listAll();
                System.out.println("Enter item number to delete");
                int n=input.nextInt();
                todo.deleteItem(n-1);
                System.out.println("1 item deleted!");

            }
            else if(option==3){
                todo.listAll();

            }else{flag=1;}}
    }
}
class ToDoList{
    //ArrayList of Strings
    ArrayList<String> todo = new ArrayList<String>();

    //function for adding item
    public  void addItem(String item){
        this.todo.add(item);
    }

    //function for deleting item
    public void deleteItem(int num){
        this.todo.remove(num);
    }

    //function for listing all itemsToDoList
    public void listAll(){
        for (int i = 0; i < this.todo.size(); i++) {
            System.out.println((i+1)+"."+this.todo.get(i));
        }
    }
}

