package util.Stack;

import util.SinglyList.SinglyList;

/**
 * Created by yejiaquan on 2016/10/13.
 */
public final class LinkedStack<T> implements Stack<T>{
    private SinglyList<T>list;
    public LinkedStack(){
        this.list=new SinglyList<T>();
    }
    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public void push(T x) {
        this.list.insert(0,x);
    }

    @Override
    public T peek() {
        return this.list.get(0);
    }

    @Override
    public T pop() {
        return this.list.remove(0);
    }
}
