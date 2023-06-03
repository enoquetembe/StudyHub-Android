package com.enoque.studyhub_android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.enoque.studyhub_android.R;

public class SettingsFragment extends Fragment {

    private Switch switchTheme;
    private Spinner spinnerLanguage;
    private Switch switchNotifications;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        switchTheme = view.findViewById(R.id.switchTheme);
        spinnerLanguage = view.findViewById(R.id.spinnerLanguage);
        switchNotifications = view.findViewById(R.id.switchNotifications);

        // Configuração do evento para o switch de tema do aplicativo
        switchTheme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    // Habilitar o tema escuro
                    setAppTheme(AppTheme.DARK);
                } else {
                    // Habilitar o tema claro
                    setAppTheme(AppTheme.LIGHT);
                }
            }
        });

        // Configuração do evento para o spinner de idioma
        spinnerLanguage.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String selectedLanguage = spinnerLanguage.getSelectedItem().toString();
                setLanguage(selectedLanguage);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Nenhuma ação necessária
            }
        });

        // Configuração do evento para o switch de notificações
        switchNotifications.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    enableNotifications();
                } else {
                    disableNotifications();
                }
            }
        });

        return view;
    }

    private void setAppTheme(AppTheme theme) {
        // Implemente a lógica para alterar o tema do aplicativo
        // Você pode usar recursos como AppCompatDelegate.setDefaultNightMode() para alterar o tema
        // Exemplo:
        // if (theme == AppTheme.DARK) {
        //     AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        // } else {
        //     AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        // }
    }

    private void setLanguage(String language) {
        // Implemente a lógica para alterar o idioma do aplicativo
        // Você pode usar recursos como Locale.setDefault() para alterar o idioma
        // Exemplo:
        // Locale newLocale = new Locale(language);
        // Configuration config = getResources().getConfiguration();
        // config.setLocale(newLocale);
        // getResources().updateConfiguration(config, getResources().getDisplayMetrics());
        // getActivity().recreate();
    }

    private void enableNotifications() {
        // Implemente a lógica para habilitar as notificações
        // Exemplo:
        // Toast.makeText(getActivity(), "Notificações habilitadas", Toast.LENGTH_SHORT).show();
    }

    private void disableNotifications() {
        // Implemente a lógica para desabilitar as notificações
        // Exemplo:
        // Toast.makeText(getActivity(), "Notificações desabilitadas", Toast.LENGTH_SHORT).show();
    }

    // Defina suas constantes de tema do aplicativo, se necessário
    private enum AppTheme {
        LIGHT,
        DARK
    }

}
