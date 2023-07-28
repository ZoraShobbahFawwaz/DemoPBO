//Class Abstract
//Inheritance 
//Encapsulation 
//Overriding
//Overloading

abstract class Peminjaman{
    void denda(){}
    void pengembalian(){}
}

class PBO extends Peminjaman{
    @Override                     //dekorator
    void denda(){

    }
}

class Family{
    public int x;                 //akses

    void print(String tipeAnggota, int bayar) {
        System.out.println("Print Family");
    }

    void print(String tipeAnggota) {
        System.out.println("Print Family");
    }
    void print(){
        System.out.println("Print Family");
    }
}

class A extends Family{
    @Override
    void print(){
        System.out.println("Print A");
    }
    void test(){
        print();
        x = 5;
    }
}

class B extends A{
    void test2(){
        print();
    }
}

public class App extends Family {
    public static void main(String[] args) throws Exception {
        Family parent = new Family();
        parent.print();
        parent.print("Mahasiswa");

        A a = new A();
        a.print();

    }
}