package com.example.a4thyearmobiletimetableproject.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            //return "Hello world from section: " + input;
            if(input == 1){
                return "-> Update: 15/02/2023\n" +
                        "\n" +
                        "Welcome to our homepage!\n" +
                        "Here you can find the latest news \n and updates from our app!\n" +
                        "We hope you enjoy!";
            }
            else if(input == 2){
                return "Welcome to the timetables tab!\n" +
                        "This is where you can find the timetables \n of the different busses that our app supports!";
            }
            return "Hello world from section: " +input;
        }

    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}