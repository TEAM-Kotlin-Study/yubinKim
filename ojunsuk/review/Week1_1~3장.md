# [ Kotlin Study๐ฑ] Week 1: 1~3์ฅ ์์ฝ
## 1์ฅ Android Stidio ์ค์น
   - โ ๏ธ 35ํ์ด์ง **HAXM ์ค์น** ๊ด๋ จ -> ํด๋น ์ค์น๊ฐ ๋จ์ง์์ ์ค์น ๋ชปํจ
   - ๊ทธ ์ธ ์ค์น ์๋ฃ
## 2์ฅ ๊ธฐ๊ธฐ์ ์๋ฎฌ๋ ์ดํฐ ์ค๋น
  - ์ฌ์ฉํ์ง ์๋ ๊ฐค๋ญ์ ํฐ์ ํตํด ๊ธฐ๊ธฐ ์คํ ์๋ฃ
  - ์๋ฎฌ๋ ์ดํฐ ์คํ ์๋ฃ
## 3์ฅ ์ฒซ๋ฒ์งธ ์ฑ ๋ง๋ค๊ธฐ
### ๊ธฐ๋ณธ ํ๋ฉด ๊ตฌ์ฑ
  - **Android** : ์๋๋ก์ด๋์ฉ์ผ๋ก ์ต์ ํ๋ ๋ชจ๋
  - **Project** : ์ค์  ํด๋ ๊ตฌ์กฐ๋๋ก ๋ณด๋ ๋ชจ๋. ์ ๋ชจ๋์ผ๋ ๋ณด์ด์ง ์๋ ํ์ผ ํ์
### ํ๋ก์ ํธ ๊ตฌ์กฐ
  - **AndroidManifest.xml** : ์ฑ ๊ตฌ์ฑ์ ๊ธฐ์ ํ ํ์ผ. ๋ณดํต์ ์๋์ผ๋ก ์์ฑ๋๋ ํน์  ์์์ ํ๊ธฐ ์ํด ์ฑ์ ๊ถํ์ ์ถ๊ฐํ  ๋๋ ์ง์  ํธ์ง. ์์ผ๋ก **๋งค๋ํ์คํธ**๋ผ๊ณ  ์ธ๊ธํ๋ฉด ์ด ํ์ผ์ ๊ฐ๋ฅดํค๋ ๊ฒ.
  - **MainActivity.kt | activity_main.xml** : MainActivity.kt ํ์ผ์๋ ์ฝ๋๋ฅผ ์์ฑ, activity_main.xml ํ์ผ์๋ ํ๋ฉด ๋ ์ด์์์ ์์ฑ. ๋์ ํ ์ธํธ
  - **build.gradle** : ํ๋ก์ ํธ ์์ค๊ณผ ๋ชจ๋ ์์ค์ build.gradle ํ์ผ์ ์๋๋ก์ด๋ ๋น๋ ๊ตฌ์ฑ ํ์ผ *(๋น๋ : ํ๋ก๊ทธ๋จ์ ์คํ ๊ฐ๋ฅํ ์ํ๋ก ๋ง๋๋ ๊ณผ์ )*
### ๋ ์ด์์ ์๋ํฐ
  1. **ํ๋ ํธ ์ฐฝ** : ๋ ์ด์์ ๋์์ธ์ ํ์ํ ๋ทฐ ์ ๊ณต
  2. **์ปดํฌ๋ํธ ํธ๋ฆฌ ์ฐฝ** : ๋ ์ด์์์ ์ ์ฒด ๊ตฌ์กฐ ํ๋์ ๋ณผ ์ ์์
  3. **๋์์ธ ์ฐฝ** : ๋ทฐ๋ฅผ ๋ฐฐ์นํ์ฌ ๋ ์ด์์์ ์์ฑํ๋ ํ๋ฉด
  4. **์์ฑ ์ฐฝ** : ์์ฑ์ ์ค์ ํ  ์ ์์
### ๋ ์ด์์ ์์ฑํ๊ธฐ
  1. ํ์คํธ ๋ทฐ ๋ฐฐ์นํ๊ธฐ
  2. ๋ฌธ์์ด์ ๋ฆฌ์์ค๋ก ๋ง๋ค๊ธฐ
  3. ๋ค๊ตญ์ด ์ถ๊ฐํ๊ธฐ
  4. ์ ์ฝ ์์ ํ๊ธฐ
### ์ฝ๋ ์์ฑํ๊ธฐ 
  1. ์กํฐ๋นํฐ
  2. ์กํฐ๋นํฐ์ ๋ ์ด์์ ํ์ผ ๊ฐ ์ ํ ๋ฐฉ๋ฒ
  3. ๋ฒํผ ๋ฐฐ์นํ๊ธฐ
  4. ๋ฒํผ ํด๋ฆญ์ ์ด๋ฒคํธ ์ฒ๋ฆฌ ๋ฐฉ๋ฒ
### โ ๏ธ 3์ฅ ๋ฌธ์ ์  
   - RUNํ  ์ ์๋ ์ค๋ฅ๊ฐ ๋จ๋๋ฐ, ์ฝ๋๋ฅผ ๋ค์๋ณด๊ณ  ๊ตฌ๊ธ๋ง์ ํด๋ด๋ ๋ฌธ์ ์ ์ด ๋ฌด์์ธ์ง ๋ชจ๋ฅด๊ฒ ์. -> activity_main.xml์ layout์ id๋ฅผ ์์ ํจ์ผ๋ก์ ํด๊ฒฐ.
![problem](./img/problem.png)

