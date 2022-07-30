package com.think.oop.mortgage;

/**
 * @author
 * @version 1.0
 */
public class Text {
    public static void main(String[] args) {
        Employee e = new Employee("张三", 36);
        P p = new P("赵四", 6800);
        Manger m = new Manger("王五", 15000, 20000);
        Text text = new Text();
        text.showEmpAnnal(p);
        text.showEmpAnnal(m);
        text.testWork(m);
        text.testWork(p);
        text.Integer();

    }
    public void showEmpAnnal(Employee e){
        System.out.println(e.getAnnual());
        }
        public void testWork(Employee e){
            if(e instanceof P){
               ((P) e).work();
            }else if(e instanceof Manger){
                ((Manger) e).manage();
            }else{
                System.out.println();
            }
            "cba".equals("abc");
        }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void Integer(){
        System.out.println();
    }

}


