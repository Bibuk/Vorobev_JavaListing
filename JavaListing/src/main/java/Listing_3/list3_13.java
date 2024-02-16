package Listing_3;

class ParaByRef3_13 {
    int x, y;

    ParaByRef3_13(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void callByRef(ParaByRef3_13 o) {
        o.x = o.x + this.x;
        o.y = o.y + this.y;
    }

}

class ParaByRefDemo {

    public static void main(String[] args) {
        ParaByRef3_13 p = new ParaByRef3_13(2,3);
        ParaByRef3_13 q = new ParaByRef3_13(3, 2);

        System.out.println("q.x = " + q.x);
        System.out.println("q.y = " + q.y);

        p.callByRef(q);

        System.out.println("q.x = " + q.x);
        System.out.println("q.y = " + q.y);
    }
}