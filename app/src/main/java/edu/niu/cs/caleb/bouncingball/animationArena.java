package edu.niu.cs.caleb.bouncingball;

import android.graphics.Canvas;

/**
 * Created by z1731660 on 4/13/2017.
 */
public class animationArena {
    private Ball myBall;

    public animationArena() {

        myBall = new Ball();

    }


    public void update(int w, int h){

        myBall.move(0,0,w,h);


    }

    public void draw(Canvas canvas){
        //bg color
        canvas.drawRGB(156,174,216);
        myBall.draw(canvas);
    }


}
