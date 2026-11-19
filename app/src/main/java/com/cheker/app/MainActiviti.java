
package com.cheker.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);

LinearLayout layout = new LinearLayout(this);
layout.setOrientation(LinearLayout.VERTICAL);
layout.setGravity(Gravity.CENTER);
layout.setPadding(30, 30, 30, 30);
layout.setBackgroundColor(Color.rgb(15, 18, 30));

TextView title = new TextView(this);
title.setText("ЧЕКЕР");
title.setTextSize(32);
title.setTextColor(Color.WHITE);
title.setGravity(Gravity.CENTER);

TextView status = new TextView(this);
status.setText("Защита выключена");
status.setTextColor(Color.GREEN);
status.setTextSize(20);
status.setGravity(Gravity.CENTER);

Button button = new Button(this);
button.setText("Включить защиту");
button.setOnClickListener(v ->
status.setText("Защита включена")
);

layout.addView(title);
layout.addView(status);
layout.addView(button);

setContentView(layout);
}
}
