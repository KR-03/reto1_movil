package co.usa.ciclo4.reto1v2.ui.sucursales;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SucursalesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SucursalesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("En un futuro implementaremos mas sucursales");
    }

    public LiveData<String> getText() {
        return mText;
    }
}