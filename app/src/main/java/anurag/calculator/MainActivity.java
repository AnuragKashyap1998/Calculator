package anurag.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText useEditText;
    Double result;
    int flag;
    private String str;
    private String check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        flag=-1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        useEditText=(EditText)findViewById(R.id.mytext);
            Button plus = (Button) findViewById(R.id.plus);
            plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    check=useEditText.getText().toString();
                    if(check.length()!=0) {
                        if (useEditText.getText().toString() != null) {
                            Double a;
                            if(flag==-1) {
                                a = Double.parseDouble(useEditText.getText().toString());
                                result=a;
                            }
                            else
                            {
                                if(flag==0)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result+a;
                                }
                                if(flag==1)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result-a;
                                }
                                if(flag==2)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result/a;
                                }
                                if(flag==3)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result*a;
                                }

                            }

                            flag = 0;
                            useEditText.setText(null);
                        }
                    }
                }
            });

            Button minus = (Button) findViewById(R.id.minus);
            minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    check=useEditText.getText().toString();
                    if(check.length()!=0) {
                        if (useEditText.getText().toString() != null) {
                            Double a;
                            if(flag==-1) {
                                a = Double.parseDouble(useEditText.getText().toString());
                                result=a;
                            }
                            else
                            {
                                if(flag==0)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result+a;
                                }
                                if(flag==1)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result-a;
                                }
                                if(flag==2)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result/a;
                                }
                                if(flag==3)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result*a;
                                }

                            }

                            flag = 1;
                            useEditText.setText(null);
                        }
                    }
                }
            });

            Button divide = (Button) findViewById(R.id.divide);
            divide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    check=useEditText.getText().toString();
                    if(check.length()!=0) {
                        if (useEditText.getText().toString() != null) {
                            Double a;

                            if(flag==-1) {
                                a = Double.parseDouble(useEditText.getText().toString());
                                result=a;
                            }
                            else
                            {
                                if(flag==0)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result+a;
                                }
                                if(flag==1)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result-a;
                                }
                                if(flag==2)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result/a;
                                }
                                if(flag==3)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result*a;
                                }

                            }
                            flag = 2;
                            useEditText.setText(null);
                        }
                    }
                }
            });
            Button multiply = (Button) findViewById(R.id.mutiply);
            multiply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    check=useEditText.getText().toString();
                    if(check.length()!=0) {
                        if (useEditText.getText().toString() != null) {
                            Double a;
                            if(flag==-1) {
                                a = Double.parseDouble(useEditText.getText().toString());
                                result=a;
                            }
                            else
                            {
                                if(flag==0)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result+a;
                                }
                                if(flag==1)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result-a;
                                }
                                if(flag==2)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result/a;
                                }
                                if(flag==3)
                                {
                                    a = Double.parseDouble(useEditText.getText().toString());
                                    result=result*a;
                                }

                            }
                            flag = 3;
                            useEditText.setText(null);
                        }
                    }
                }
            });
            Button one =(Button) findViewById(R.id.one);
            one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useEditText.setText(useEditText.getText()+"1");
            }
            });
            Button two =(Button) findViewById(R.id.two);
            two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                useEditText.setText(useEditText.getText()+"2");
            }
            });
            Button three =(Button) findViewById(R.id.three);
            three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                useEditText.setText(useEditText.getText()+"3");
            }
            });
            Button four =(Button) findViewById(R.id.four);
            four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useEditText.setText(useEditText.getText()+"4");
            }
            });
            Button five =(Button) findViewById(R.id.five);
            five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useEditText.setText(useEditText.getText()+"5");
            }
            });
            Button six =(Button) findViewById(R.id.six);
            six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useEditText.setText(useEditText.getText()+"6");
            }
            });
            Button seven =(Button) findViewById(R.id.seven);
            seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useEditText.setText(useEditText.getText()+"7");
            }
            });
            Button eight =(Button) findViewById(R.id.eight);
            eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useEditText.setText(useEditText.getText()+"8");
            }
            });
            Button nine =(Button) findViewById(R.id.nine);
            nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useEditText.setText(useEditText.getText()+"9");
            }
            });
            Button zero =(Button) findViewById(R.id.zero);
            zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useEditText.setText(useEditText.getText()+"0");
            }
            });
            Button dot =(Button) findViewById(R.id.dot);
            dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useEditText.setText(useEditText.getText()+".");
            }
            });
            Button oneclear=(Button) findViewById(R.id.oneclear);
            oneclear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    str = useEditText.getText().toString();
                    if(str.length()!=0) {

                        useEditText.setText(str.substring(0, str.length() - 1));
                    }
                    if(str.length()==0)
                    {
                        useEditText.setText(null);
                    }
                }
            });
            Button equals = (Button) findViewById(R.id.equals);
            equals.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (flag>=0&&flag<4) {
                        Double b = Double.parseDouble(useEditText.getText().toString());
                        if (flag == 0) {
                            flag = -1;
                            result = result + b;
                            useEditText.setText(Double.toString(result));
                        }
                        if (flag == 1) {
                            flag = -1;
                            result = result - b;
                            useEditText.setText(Double.toString(result));
                        }
                        if (flag == 2) {
                            flag = -1;
                            result = result / b;
                            useEditText.setText(Double.toString(result));
                        }
                        if (flag == 3) {
                            flag = -1;
                            result = result * b;
                            useEditText.setText(Double.toString(result));
                        }
                    }

                }
            });

            Button clear = (Button) findViewById(R.id.clear);
            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    useEditText.setText(null);
                    flag=-1;
                }
            });
    }
}
