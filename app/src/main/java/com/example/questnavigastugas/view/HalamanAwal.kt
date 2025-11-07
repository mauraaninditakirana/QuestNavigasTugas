package com.example.questnavigastugas.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas.R
import com.example.questnavigastugas.Routes

@Composable
fun HalamanAwal(navController: NavController) {
    val backgroundColor = Color(0xFFF3E5F5)
    val textColor = Color(0xFF3F51B5)
    val buttonColor = Color(0xFF263A9A)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(32.dp), // Beri padding di sekeliling
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround // Beri jarak merata
    ){
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Selamat Datang",
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            color = textColor,
            style = TextStyle(lineHeight = 56.sp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                // 2. Ganti R.drawable.logo_card_lst dengan nama file gambar Anda
                painter = painterResource(id = R.drawable.foto2),
                contentDescription = "Logo Aplikasi",
                modifier = Modifier.size(280.dp)
            )
            Text(
                text = "Maura Anindita Kirana\n20230140090",
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                textAlign = TextAlign.Center,
                lineHeight = 24.sp
            )
        }
        Button(
            onClick = {
                // 3. Aksi untuk navigasi ke halaman List Daftar
                navController.navigate(Routes.LIST_DAFTAR)
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(25.dp), // Membuat tombol oval
            colors = ButtonDefaults.buttonColors(containerColor = buttonColor)
        ){

        }
    }
}