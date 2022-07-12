class room {
    float l;
    float b;
    void getData (float a, float b)
    {
        l = a;
        b = b;
        
    }
}

class RoomArea {
    public static void main(String args[]) 
    {
        float area;
        room x  = new room();
        area = x.l * x.b;
        System.out.println("area is = " + area);

    }
}