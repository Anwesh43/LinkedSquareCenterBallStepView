package coml.anwesh.uiprojects.squarecenterballstepview

/**
 * Created by anweshmishra on 18/12/18.
 */

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color
import android.graphics.RectF

val nodes : Int = 5
val balls : Int = 4
val scDiv : Double = 0.51
val scGap : Float = 0.05f
val strokeFactor : Int = 90
val sizeFactor : Float = 2.5f
val color : Int = Color.parseColor("#283593")