package com.example.activitycollectionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Calculator extends AppCompatActivity {

    TextView result;
    TextView lastnum;

    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;

    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    Button equals;
    Button point;

    Button clear;

    int reference_to_last_num = 0;
    boolean hasChanged = false;
    Stack<String> calculation = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getSupportActionBar().hide();

        result = (TextView) findViewById(R.id.solution_tv);

        zero = (Button) findViewById(R.id.button_0);
        one = (Button) findViewById(R.id.button_1);
        two = (Button) findViewById(R.id.button_2);
        three = (Button) findViewById(R.id.button_3);
        four = (Button) findViewById(R.id.button_4);
        five = (Button) findViewById(R.id.button_5);
        six = (Button) findViewById(R.id.button_6);
        seven = (Button) findViewById(R.id.button_7);
        eight = (Button) findViewById(R.id.button_8);
        nine = (Button) findViewById(R.id.button_9);

        List<Button> buttons = new ArrayList<>();
        buttons.add(zero);
        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(four);
        buttons.add(five);
        buttons.add(six);
        buttons.add(seven);
        buttons.add(eight);
        buttons.add(nine);

//        Stack<String> calculation = new Stack<>();

        for (Button b : buttons) {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Button x = (Button) view;
                    String num = x.getText().toString();

                    if (result.getText().equals("0")){
                        result.setText(num);
                    } else {
                        result.setText(result.getText() + num);
                    }

                    if (calculation.isEmpty() || hasChanged) {
                        calculation.push(result.getText().toString().substring(reference_to_last_num, result.length())); //push the number to the stack first
                        hasChanged = false;
                    } else {
                        calculation.pop();
                        calculation.push(result.getText().toString().substring(reference_to_last_num, result.length())); //push the number to the stack first
                    }

                    String res = calculateSequence(((Stack<String>)calculation.clone()));


                    if (isNotInteger(res)) {
                        lastnum.setText("= " + Float.parseFloat(res));
                    } else {
                        lastnum.setText("= " + ((int) Float.parseFloat(res)));
                    }
                }
            });
        }

        clear = (Button) findViewById(R.id.button_c);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                lastnum.setText("");
                calculation = new Stack<>();
                reference_to_last_num = 0;
                hasChanged = true;

            }
        });



        point = (Button) findViewById(R.id.button_dot);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button y = (Button) view;
                String p = y.getText().toString();

                if (!result.getText().toString().substring(reference_to_last_num, result.length()).contains(".")){
                    result.setText(result.getText() + p);
                }
            }
        });

        add = (Button) findViewById(R.id.button_plus);
        subtract = (Button) findViewById(R.id.button_minus);
        multiply = (Button) findViewById(R.id.button_multiply);
        divide = (Button) findViewById(R.id.button_divide);
        equals = (Button) findViewById(R.id.button_equals);

        List<Button> ops = new ArrayList<>();
        ops.add(add);
        ops.add(subtract);
        ops.add(multiply);
        ops.add(divide);

        lastnum = (TextView) findViewById(R.id.result_tv);

        for (Button b : ops) {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int i = -1;
                    if(!hasChanged){
                        i = 0;
                    }
                    Button o = (Button) view;
                    String operator = o.getText().toString();

                    System.out.println(calculation.isEmpty());
                    switch(operator) {
                        case "+":

                            if (!calculation.peek().equals("+") && !hasChanged) {
                                calculation.push("+");
                                result.setText(result.getText() + "+");
                            } else {
                                result.setText(result.getText().toString().substring(0, result.length()-i) + "+");
                                calculation.pop();
                                calculation.push("+");
                            }

                            reference_to_last_num = result.length();
                            hasChanged = true;
                            break;
                        case "-":
                            if (!calculation.peek().equals("-") && !hasChanged) {
                                calculation.push("-");
                                result.setText(result.getText() + "-");
                            } else {
                                result.setText(result.getText().toString().substring(0, result.length()-i) + "-");
                                calculation.pop();
                                calculation.push("-");
                            }

                            reference_to_last_num = result.length();
                            hasChanged = true;
                            break;
                        case "*":
                            if (!calculation.peek().equals("*") && !hasChanged) {
                                calculation.push("*");
                                result.setText(result.getText() + "*");
                            } else {
                                result.setText(result.getText().toString().substring(0, result.length()-i) + "*");
                                calculation.pop();
                                calculation.push("*");
                            }

                            reference_to_last_num = result.length();
                            hasChanged = true;
                            break;
                        case "/":
                            if (!calculation.peek().equals("/") && !hasChanged) {
                                calculation.push("/");
                                result.setText(result.getText() + "/");
                            } else {
                                result.setText(result.getText().toString().substring(0, result.length()-i) + "/");
                                calculation.pop();
                                calculation.push("/");
                            }

                            reference_to_last_num = result.length();
                            hasChanged = true;
                            break;
                    }

                    System.out.println(calculation.peek().toString());
                }
            });
        }

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = calculateMDAS(((Stack<String>)calculation.clone()));

                if (isNotInteger(res)) {
                    lastnum.setText("= " + Float.parseFloat(res));
                } else {
                    lastnum.setText("= " + (int) Float.parseFloat(res));
                }


                result.setText("");
                calculation = new Stack<>();
                calculation.push(res);
                hasChanged = false;
                reference_to_last_num = 1;
            }
        });
    }

    public boolean isNotInteger(String s) {
        float num = Float.parseFloat(s);

        return num - Math.floor(num) > 0;
    }

    public String calculateSequence(Stack s) {
        String result = "";

        //reverse stack
        Stack<String> final_stack = new Stack<>();
        while (!s.isEmpty()) {
            final_stack.push(s.pop().toString());
        }
        System.out.println("stack size: " + final_stack.size());
        System.out.println("checking stack top before solving: " + final_stack.peek());
        //solve stack to solve sequentially
        while(!(final_stack.size() == 1)) {
            float initial_num = Float.parseFloat(final_stack.pop());
            float second_num, res;
            switch(final_stack.pop()) { /*solving for the operator*/
                case "+":
                    second_num = Float.parseFloat(final_stack.pop());
                    res = initial_num + second_num;
                    final_stack.push(String.valueOf(res));
                    break;
                case "-":
                    second_num = Float.parseFloat(final_stack.pop());
                    res = initial_num - second_num;
                    final_stack.push(String.valueOf(res));
                    break;
                case "*":
                    second_num = Float.parseFloat(final_stack.pop());
                    res = initial_num * second_num;
                    final_stack.push(String.valueOf(res));
                    break;
                case "/":
                    second_num = Float.parseFloat(final_stack.pop());

                    res = initial_num / second_num;
                    if(second_num == 0){
                        final_stack.push(String.valueOf(0));
                    }else{
                        final_stack.push(String.valueOf(res));
                    }
                    break;
            }
        }
        //final num is result
        result = final_stack.pop();
        return result;
    }

    public String calculateMDAS(Stack s) {
        String result = "";

        //make a stack to use for the final stack
        Stack<String> secondstack = new Stack<>();

        //run through the s stack: push nums by default, evaluate any operator following MDAS by popping from both stacks before pushing again
        while (!s.isEmpty()) {
            float first_num;
            float second_num, res;
            switch (s.peek().toString()){
                case "*":
                    s.pop();
                    first_num = Float.parseFloat(s.pop().toString());
                    second_num = Float.parseFloat(secondstack.pop());
                    res = first_num * second_num;
                    secondstack.push(String.valueOf(res));
                    break;
                default:
                    secondstack.push(s.pop().toString());
            }
        }

        s = stackReverser(((Stack<String>) secondstack.clone())); //reverse the stack before parsing another operator
        secondstack = new Stack<>();

        while (!s.isEmpty()) {
            float first_num;
            float second_num, res;
            switch (s.peek().toString()){
                case "/":
                    s.pop();
                    first_num = Float.parseFloat(s.pop().toString());
                    second_num = Float.parseFloat(secondstack.pop());
                    res = first_num / second_num;
                    if(second_num == 0){
                        secondstack.push(String.valueOf(0));
                    }else{
                        secondstack.push(String.valueOf(res));
                    }


                    break;
                default:
                    secondstack.push(s.pop().toString());
            }
        }

        s = stackReverser(((Stack<String>) secondstack.clone())); //reverse the stack before parsing another operator
        secondstack = new Stack<>();

        while (!s.isEmpty()) {
            float first_num;
            float second_num, res;
            switch (s.peek().toString()){
                case "+":
                    s.pop();
                    first_num = Float.parseFloat(s.pop().toString());
                    second_num = Float.parseFloat(secondstack.pop());
                    res = first_num + second_num;
                    secondstack.push(String.valueOf(res));
                    break;
                default:
                    secondstack.push(s.pop().toString());
            }
        }

        s = stackReverser(((Stack<String>) secondstack.clone())); //reverse the stack before parsing another operator
        secondstack = new Stack<>();
        while (!s.isEmpty()) {
            float first_num;
            float second_num, res;
            switch (s.peek().toString()){
                case "-":
                    s.pop();
                    first_num = Float.parseFloat(s.pop().toString());
                    second_num = Float.parseFloat(secondstack.pop());
                    res = first_num - second_num;
                    secondstack.push(String.valueOf(res));
                    break;
                default:
                    secondstack.push(s.pop().toString());
            }
        }

        result = secondstack.pop();
        return result;
    }

    public Stack stackReverser(Stack s) {
        Stack<String> reversed = new Stack<>();

        while (!s.isEmpty()) {
            reversed.push(s.pop().toString());
        }
        return reversed;
    }
}