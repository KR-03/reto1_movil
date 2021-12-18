package co.usa.ciclo4.reto1v2.ui.perfil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PerfilViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PerfilViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bienvenidos a Medusa Beauty Studio");
    }

    public LiveData<String> getText() {
        return mText;
    }
}