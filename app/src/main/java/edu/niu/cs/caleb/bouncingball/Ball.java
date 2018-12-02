package edu.niu.cs.caleb.bouncingball;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by z1731660 on 4/13/2017.
 */
public class Ball {

    private final int RADIUS = 25, REVERSE = -1;

    private int x,y, velX, velY;

    public Ball() {
        x = 100;
        y = 100;
        velX = 35;
        velY = 35;
    }

    public void move(int left, int top, int right, int bot){
        x += velX;
        y += velY;

        //determine if the ball hit a wall
        if (y > bot - RADIUS){
            y = bot - RADIUS;
            velY *= REVERSE;
        }
        else if (y < top+RADIUS){
            y =top + RADIUS;
            velY *= REVERSE;
        }
        else if (x > right-RADIUS){
            x = right - RADIUS;
            velX *= REVERSE;
        }
        else  if (x < left + RADIUS){
            x = left+RADIUS;
            velX *= REVERSE;
        }

    }
    public void draw(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawCircle(x,y,RADIUS,paint);
    }

}
