//package com.example.everythingstore;
//
//import android.text.Editable;
//import android.text.TextWatcher;
//import android.view.View;
//import android.widget.EditText;
//
//public class GenericTextWatcher implements TextWatcher
//{
//    private View view;
//    public GenericTextWatcher(View view)
//    {
//        this.view = view;
//    }
//
//    @Override
//    public void afterTextChanged() {
//        // TODO Auto-generated method stub
//        String text = editable.toString();
//        switch(view.getId())
//        {
//
//            case R.id.otp_digit_1:
//                if(text.length()==1)
//                    view.findViewById(R.id.otp_digit_2).requestFocus();
//                break;
//            case R.id.otp_digit_2:
//                if(text.length()==1)
//                    view.findViewById(R.id.otp_digit_3).requestFocus();
//                else if(text.length()==0)
//                    view.findViewById(R.id.otp_digit_1).requestFocus();
//                break;
//            case R.id.otp_digit_3:
//                if(text.length()==1)
//                    view.findViewById(R.id.otp_digit_4).requestFocus();
//                else if(text.length()==0)
//                    view.findViewById(R.id.otp_digit_2).requestFocus();
//                break;
//            case R.id.otp_digit_4:
//                if(text.length()==0)
//                    view.findViewById(R.id.otp_digit_3).requestFocus();
//                break;
//        }
//    }
//
//    @Override
//    public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
//        // TODO Auto-generated method stub
//    }
//
//    @Override
//    public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
//        // TODO Auto-generated method stub
//    }
//}