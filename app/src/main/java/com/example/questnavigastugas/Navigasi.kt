package com.example.questnavigastugas

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas.view.Formulir
import com.example.questnavigastugas.view.HalamanAwal
import com.example.questnavigastugas.view.ListDaftar

object Routes {
    const val HALAMAN_AWAL = "HalamanAwal"
    const val LIST_DAFTAR = "ListDaftar"
    const val FORMULIR = "Formulir"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.HALAMAN_AWAL
    ) {
        composable(Routes.HALAMAN_AWAL) {
            HalamanAwal(navController = navController)
        }
        composable(Routes.LIST_DAFTAR) {
            ListDaftar(navController = navController)
        }
        composable(Routes.FORMULIR) {
            Formulir(navController = navController)
        }
    }
}