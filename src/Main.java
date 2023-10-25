public class Main {
    int[][] array = new int[6][6];
    int lowest = 1000;
    String bestpath = "";
    public static void main(String[] args) {
        Main myMain = new Main();
    }
    public Main(){
        for(int x = 0; x<array.length; x++){
            for(int y =0; y<array[0].length; y++){
                array[x][y] = (int)(Math.random()*100);
                System.out.print(array[x][y] + ", ");
            }
            System.out.println("");
        }
        System.out.println();
        move(0,0,0, "start");
        System.out.println("lowest overall: " + lowest);
        System.out.println("best path: " + bestpath);
    }
    public void move(int x, int y, int total, String path){
        if(x==(array.length-1) && y==(array[0].length-1)){
            //System.out.println(x + "," + y + ": " + array[x][y]);
            //System.out.println("final total: " + (int)(total+array[x][y]));
            if(total<lowest){
                lowest = total;
                System.out.println("lowest thusfar: " + total);
                System.out.println("");
                bestpath = path;
            }
        }
        if(x<(array.length-1) && y<(array[0].length-1)){
            //System.out.println(x + "," + y + ": " + array[x][y]);
            //System.out.println("total: " + (int)(total+array[x][y]));
            if(total<lowest){
                move(x+1,y+1,total+array[x][y],path + ", diagonal");
            }
        }
        if(x<(array.length-1)){
            //System.out.println(x + "," + y + ": " + array[x][y]);
            //System.out.println("total: " + (int)(total+array[x][y]));
            if(total<lowest){
                move(x+1,y,total+array[x][y], path + ", down");
            }
        }
        if(y<(array[0].length-1)){
            //System.out.println(x + "," + y + ": " + array[x][y]);
            //System.out.println("total: " + (int)(total+array[x][y]));
            if(total<lowest){
                move(x,y+1,total+array[x][y], path + ", right");
            }
        }
        if(total>lowest){
            //System.out.println("route terminated");
            //System.out.println("");
        }
    }
}