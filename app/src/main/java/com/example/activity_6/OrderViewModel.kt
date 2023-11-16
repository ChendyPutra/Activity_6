package com.example.activity_6

import com.example.activity_6.Data.OrderUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.text.NumberFormat

private val HARGA_PER_CUP = 3000

class OrderViewModel {
    private val _stateUI = MutableStateFlow(OrderUIState())
    val stateUI: StateFlow<OrderUIState> = _stateUI.asStateFlow()

    fun setJumlah(jmlBestTea: Int) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                jumlah = jmlBestTea,
                harga = hitungHarga(jumlah = jmlBestTea)
            )
        }
    }

    fun setRasa(rasaPilihan: String) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                rasa = rasaPilihan
            )
        }
    }

    fun resetOrder() {
        _stateUI.value = OrderUIState()
    }

    fun hitungHarga(jumlah: Int = _stateUI.value.jumlah): String {
        val kalkulasiHarga = jumlah * HARGA_PER_CUP

        return NumberFormat.getNumberInstance().format(kalkulasiHarga)


    }



}