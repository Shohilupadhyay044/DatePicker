# DatePicker&TimePicker
Datepicker is an IOS datepicker widget-like date and time picker library.

The library has many different feature options to customize your widget.

To Add the Following Library : 

https://jitpack.io/#Shohilupadhyay044/DatePicker/1.0.0

     
             DatePicker datePicker = findViewById(R.id.datepicker);
        datePicker.setOffset(3);
        datePicker.setTextSize(19);
        datePicker.setPickerMode(DatePicker.DAY_ON_FIRST);
        datePicker.setMaxDate(/*long time*/);
        datePicker.setDate(/*long time*/);
        datePicker.setMinDate(/*long time*/);
        
        datePicker.setDataSelectListener(new DatePicker.DataSelectListener() {
            @Override
            public void onDateSelected(long date, int day, int month, int year) {
               
            }
        });![image](https://user-images.githubusercontent.com/75352285/235239230-c20fb2cd-735e-42e1-91ad-d773b0345721.png)



