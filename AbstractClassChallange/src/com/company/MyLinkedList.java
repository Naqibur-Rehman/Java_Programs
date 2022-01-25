package com.company;

import java.util.List;

public class MyLinkedList implements NodeList{

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newitem) {
        if (this.root == null){
            // The list was empty, so this item becomes the head of the list
            this.root = newitem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(newitem);
            if (comparison < 0) {
                // newItem is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else{
                    // there is no next, so insert at end of the list
                    currentItem.setNext(newitem).setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > 0){
                // newItem is less, so insert before
                if (currentItem.previous() != null){
                    currentItem.previous().setNext(newitem).setPrevious(currentItem.previous());
                    newitem.setPrevious(currentItem).setPrevious(newitem);
                } else {
                    // the node with a previous is the root
                    newitem.setNext(this.root).setPrevious(newitem);
                    this.root = newitem;
                }
                return true;
            } else {
                //equal
                System.out.println(newitem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null){
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if (comparison == 0){
                // found the item to delete
                if (currentItem == this.root){
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison < 0) {
                currentItem = currentItem.next();
            } else {  // comparison > 0
                // we are at an item greater then the one to be deleted
                // so the item is not on list
                return false;
            }
        }
        // we have reached at the end of the list
        // with out finding  the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem item) {
        if (root==null){
            System.out.println("List is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
