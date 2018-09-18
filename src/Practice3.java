import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Practice3 {

    public String[] removeVowels(String[] places) {
        String res="";
        for(String s: places) {
            String tmp = "";
            for(int i=0;i<s.length();i++) {
                char c = s.toLowerCase().charAt(i);
                if(c=='a' || c=='e' || c=='i' || c== 'o' || c=='u') continue;
                tmp+=s.charAt(i);
            }
            res+=tmp+";";
        }
        return res.trim().split(";");
    }

    public boolean consecutiveStreamOfNumbers(String digitSeq) {
        String[] seq = digitSeq.trim().split("\\s|,");
        for(int i=0;i<seq.length-1;i++) {
            int alpha = Integer.parseInt(seq[i]);
            int beta = Integer.parseInt(seq[i+1]);
            if(Math.abs(alpha-beta)!=1) return false;
        }
        return true;
    }

    public String[][] genChessBoard() {
        int color = 1;
        String[][] board = new String[8][8];
        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                if(color==1) board[i][j] = "WW|";
                else board[i][j] = "BB|";
                if(j!=7) color=1-color;
            }
        }
        return board;
    }

}
