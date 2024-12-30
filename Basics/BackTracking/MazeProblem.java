package Basics.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class MazeProblem {
    //this question states that maze to reach out the (1,1) for start(3,3) for giving matrix[[3,3],[3,2],[3,1],[2,3],[2,2],[2,1],[1,3],[1,2],[1,1]]
    //D refer to down
    //R refer to right
    //C refer to diagnol

    public static void main(String[] args) {
        int n = 3;
        // boolean[][] matrix = new boolean[n+1][n+1];
        // List<List<Integer>> ans = new ArrayList<>();
        //Maze(matrix,3,3,ans);
        //System.out.println(ans);
        //Maze(" ",n,n);
        //mazeDiagnal(" ",n,n);
        boolean[][] matrix  ={{true,true,true},
        {true,false,true},
        {true,true,true}};
        mazeRestrications(" ",matrix,n,n);
        
    }
    // static void Maze(boolean[][] matrix,int r,int c,List<List<Integer>> path){
    //       path.add(List.of(r,c));
    //       matrix[r][c] = true;
    //        if (r==1 && c==1){
    //         System.out.println(path);
    //         matrix[r][c]=false;
    //         path.remove(path.size()-1);
    //         return;
    //        }
           
    //        if(c>1 && !matrix[r][c-1]){
    //             Maze(matrix,r,c-1,path);
    //         }
    //       if (r>1 && !matrix[r-1][c]){
    //            Maze(matrix,r-1,c,path);
    //       }
    //       matrix[r][c]=false;
    //       path.remove(path.size()-1);
          
           
           

    // }
    // static void Maze(String p,int r,int c){
    //     if(r==1 && c ==1){
    //         System.out.println(p);
    //         return;
    //     }
    //     if(c>1){
    //         Maze(p+'D', r, c-1);
    //     }
    //     if(r>1){
    //         Maze(p+'R',r-1,c);
    //     }
    // }
    // static void mazeDiagnal(String p,int r,int c){
    //     if(r ==1 && c ==1){
    //       System.out.println(p);
    //       return;
    //     }
    //     if(r>1){
    //         mazeDiagnal(p+'D',r-1,c);
    //     }
    //     if(c>1){
    //         mazeDiagnal(p+'R',r,c-1);
    //     }
    //     if(c>1 && r>1){
    //         mazeDiagnal(p+'C',r-1,c-1);
    //     }
    // }
    static void mazeRestrications(String p,boolean[][] maze,int r,int c){
        if(r == 1 && c ==1){
            System.out.println(p);
            return;
        }
        if(!maze[r-1][c-1]){
            return;
        }
        if(r>1){
            mazeRestrications(p+'D',maze,r-1,c);
        }
        if(c>1){
            mazeRestrications(p+'R',maze,r,c-1);
        }
    }
    
}
