package com.dev.library.factory;

public interface DateFactoryListener {
    void onYearChanged();

    void onMonthChanged();

    void onDayChanged();

    void onConfigsChanged();
}
