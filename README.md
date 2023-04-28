# DatePicker&TimePicker
Datepicker is an IOS datepicker widget-like date and time picker library.

The library has many different feature options to customize your widget.

To Add the Following Library : 

https://jitpack.io/#Shohilupadhyay044/DatePicker/1.0.0

Sample Code : 
           <com.dev.library.view.datePicker.DatePicker
            android:id="@+id/datepicker"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:offset="3"
            app:pickerMode="dayFirst"
            app:textSize="19" />
Activity File :

class MainActivity : AppCompatActivity() {
    private var datePickerPopup: DatePickerPopup? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textDate = findViewById<TextView>(R.id.text_date)
        datePickerPopup = DatePickerPopup.Builder()
            .from(this)
            .offset(3)
            .darkModeEnabled(true)
            .pickerMode(DatePicker.MONTH_ON_FIRST)
            .textSize(19)
            .endDate(DateUtils.getTimeMiles(2050, 10, 25))
            .currentDate(DateUtils.getCurrentTime())
            .startDate(DateUtils.getTimeMiles(1995, 0, 1))
            .listener { dp, date, day, month, year ->
                Toast.makeText(
                    applicationContext,
                    "" + day + "/" + (month + 1) + "/" + year,
                    Toast.LENGTH_SHORT
                ).show()
            }
            .build()
        val datePicker = findViewById<DatePicker>(R.id.datepicker)
        datePicker.offset = 3
        datePicker.isDarkModeEnabled = true
        datePicker.setTextSize(19)
        datePicker.maxDate = DateUtils.getTimeMiles(2050, 10, 25)
        datePicker.date = DateUtils.getCurrentTime()
        datePicker.minDate = DateUtils.getTimeMiles(1995, 1, 12)
        datePicker.setPickerMode(DatePicker.DAY_ON_FIRST)
        datePicker.setDataSelectListener { date, day, month, year ->
            textDate.text = "" + (month + 1) + "/" + year
        }
    }
}
