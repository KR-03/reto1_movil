package co.usa.ciclo4.reto1v2.ui.productos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProductosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

        public ProductosViewModel() {
            mText = new MutableLiveData<>();
            mText.setValue("Pronto le mostraremos nuestros productos");
        }

        public LiveData<String> getText() {
            return mText;
        }

    }
