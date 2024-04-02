package kr.co.aiai.high;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Modifier;

public class ActivityPaint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ViewMe(this));
    }
    private class ViewMe extends View {

        public ViewMe(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint red = new Paint();
            red.setColor(Color.RED);
            red.setStrokeWidth(10);
            Paint ora = new Paint();
            ora.setColor(Color.rgb(255,153,000));
            ora.setStrokeWidth(10);
            Paint yel = new Paint();
            yel.setColor(Color.YELLOW);
            yel.setStrokeWidth(10);
            Paint gre = new Paint();
            gre.setColor(Color.GREEN);
            gre.setStrokeWidth(10);
            Paint blu = new Paint();
            blu.setColor(Color.BLUE);
            blu.setStrokeWidth(10);
            Paint nam = new Paint();
            nam.setColor(Color.rgb(051,000,153));
            nam.setStrokeWidth(10);
            Paint pup = new Paint();
            pup.setColor(Color.rgb(204,051,204));
            pup.setStrokeWidth(10);
            // paint.setAlpha(125);

//            Matrix matrix = new Matrix();
//            matrix.postRotate(45, 100, 100);
//            canvas.setMatrix(matrix);

//            String txt = "Hello Graphic";
//            canvas.drawText(txt, 0, txt.length(), 100, 100, paint);

            //canvas.drawRect(100,100,200,200,paint);
            //canvas.drawCircle(50,50,50, paint);


            canvas.drawLine(0,10,1000,10,red);
            canvas.drawLine(0,40,1000,40,ora);
            canvas.drawLine(0,70,1000,70,yel);
            canvas.drawLine(0,100,1000,100,gre);
            canvas.drawLine(0,130,1000,130,blu);
            canvas.drawLine(0,160,1000,160,nam);
            canvas.drawLine(0,190,1000,190,pup);

            super.onDraw(canvas);
        }

    }
}