public class shortestPath {
    public float shortPath(String path){
        int x= 0, y= 0;
        int X = 0,Y = 0;
        for(int i = 0; i < path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }else if(dir == 'N'){
                y++;
            }else if(dir == 'W'){
                x--;
            }else{
                x++;
            }

            X = x * x;
            Y = y * y;
//            return (float)Math.sqrt(X+Y);
        }
        return (float)Math.sqrt(X+Y);
    }
}
