package Exercicio9;

import java.util.ArrayList;

public class FlyweightFactory {
    protected ArrayList<AlgarismoFlyweight> objetos;

    public FlyweightFactory(){
        objetos = new ArrayList<AlgarismoFlyweight>();
    }

    public AlgarismoFlyweight getFlyweight(int num){
        switch (num){
            case 0:
                if(objetos.get(0).getNum()==-1){
                    objetos.add(new Algarismo(0));
                    System.out.printf("objeto criado %d", num);
                }
                return objetos.get(0);
            case 1:
                if(objetos.get(1).getNum()==-1){
                    objetos.add(new Algarismo(1));
                    System.out.printf("objeto criado %d", num);
                }
                return objetos.get(1);
            case 2:
                if(objetos.get(2).getNum()==-1){
                    objetos.add(new Algarismo(2));
                    System.out.printf("objeto criado %d", num);
                }
                return objetos.get(2);
            case 3:
                if(objetos.get(3).getNum()==-1){
                    objetos.add(new Algarismo(3));
                    System.out.printf("objeto criado %d", num);
                }
                return objetos.get(3);
            case 4:
                if(objetos.get(4).getNum()==-1){
                    objetos.add(new Algarismo(4));
                    System.out.printf("objeto criado %d", num);
                }
                return objetos.get(4);
            case 5:
                if(objetos.get(5).getNum()==-1){
                    objetos.add(new Algarismo(5));
                    System.out.printf("objeto criado %d", num);
                }
                return objetos.get(5);
            case 6:
                if(objetos.get(6).getNum()==-1){
                    objetos.add(new Algarismo(6));
                    System.out.printf("objeto criado %d", num);
                }
                return objetos.get(6);
            case 7:
                if(objetos.get(7).getNum()==-1){
                    objetos.add(new Algarismo(7));
                    System.out.printf("objeto criado %d", num);
                }
                return objetos.get(7);
            case 8:
                if(objetos.get(8).getNum()==-1){
                    objetos.add(new Algarismo(8));
                    System.out.printf("objeto criado %d", num);
                }
                return objetos.get(8);
            case 9:
                if(objetos.get(9).getNum()==-1){
                    objetos.add(new Algarismo(9));
                    System.out.printf("objeto criado %d", num);
                }
                return objetos.get(9);
            default:
                System.out.printf("objeto default 0");
                return objetos.get(0);
        }
    }
}
