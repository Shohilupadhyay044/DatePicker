# DatePicker
Datepicker is an IOS datepicker widget-like date and time picker library.

The library has many different feature options to customize your widget.

To Add the Following Library : 

Also u can visit the link : https://jitpack.io/#Shohilupadhyay044/DatePicker/1.0.0

    repositories {
        maven { url 'https://jitpack.io' }
    }
    
        dependencies {
	   implementation 'com.github.Shohilupadhyay044:DatePicker:1.0.0'
	}


     
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
        });

          <com.dev.library.view.datePicker.DatePicker
            android:id="@+id/datepicker"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:offset="3"
            app:pickerMode="dayFirst"
            app:textSize="19" />
            
                 datePickerPopup = new DatePickerPopup.Builder()
                .from(/*context*/)
                .offset(3)
                .pickerMode(DatePicker.MONTH_ON_FIRST)
                .textSize(19)
                .endDate(/*long time*/)
                .currentDate(/*long time*/)
                .startDate(/*long time*/)
                .listener(new DatePickerPopup.OnDateSelectListener() {
                    @Override
                    public void onDateSelected(DatePicker dp, long date, int day, int month, int year) {
                        
                    }
                })
                .build();
                
                        datePickerPopup = new DatePickerPopup.Builder()
                .from(/*context*/)
                .offset(3)
                .pickerMode(DatePicker.MONTH_ON_FIRST)
                .textSize(19)
                .endDate(/*long time*/)
                .currentDate(/*long time*/)
                .startDate(/*long time*/)
                .listener(new DatePickerPopup.OnDateSelectListener() {
                    @Override
                    public void onDateSelected(DatePicker dp, long date, int day, int month, int year) {
                        
                    }
                })
                .build();
                
                





