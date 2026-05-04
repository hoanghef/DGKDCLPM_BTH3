# 🧪 BÀI THỰC HÀNH 03 - KIỂM THỬ HỘP ĐEN

## 📌 Giới thiệu

Bài thực hành này nhằm mục tiêu xây dựng các chương trình cơ bản và áp dụng **kiểm thử hộp đen (Black-box Testing)** để kiểm tra tính đúng đắn của chương trình.

Các bài toán được triển khai gồm:

1. Tính chu vi hình chữ nhật
2. Tính diện tích hình chữ nhật
3. Giải phương trình bậc 2
4. Tính số ngày trong một tháng
5. Kiểm tra số nguyên tố
6. Tính tổng S = 1 - 2 + 3 - 4 + ... + n
7. Tìm UCLN của hai số
8. Tính tổng S = 1! + 2! + ... + n!

---

## 🎯 Mục tiêu

* Hiểu và áp dụng kiểm thử hộp đen
* Xác định **đầu vào – đầu ra mong đợi**
* Thiết kế test case hợp lý
* Phát hiện và xử lý dữ liệu không hợp lệ

---

## 🧪 Phương pháp kiểm thử

Trong bài này, các kỹ thuật kiểm thử hộp đen được áp dụng gồm:

### 1. Phân lớp tương đương

Chia dữ liệu đầu vào thành:

* Lớp hợp lệ
* Lớp không hợp lệ

### 2. Phân tích giá trị biên

Kiểm tra tại các giá trị:

* Nhỏ nhất (0, 1)
* Giá trị đặc biệt (ví dụ: tháng = 2, n = 1)

### 3. Kiểm thử dữ liệu bất thường

Bao gồm:

* Số âm
* Giá trị ngoài phạm vi
* Trường hợp ngoại lệ

---

## 📂 Cấu trúc thư mục

```
.
├── main.py           # Chương trình chính
├── test_cases.md     # Danh sách test case
├── results.txt       # Kết quả chạy test
└── README.md         # Mô tả bài làm
```

---

## ▶️ Cách chạy chương trình

1. Cài Python (>= 3.x)
2. Chạy file:

```
python main.py
```

3. Xem kết quả trực tiếp trên terminal hoặc trong file `results.txt`

---

## 📊 Kết quả kiểm thử

* ✅ Các test case hợp lệ: cho kết quả chính xác
* ✅ Các test case biên: xử lý đúng
* ✅ Các test case không hợp lệ: chương trình phát hiện và thông báo lỗi

---

## 📌 Đánh giá

Chương trình:

* Hoạt động đúng theo yêu cầu đề bài
* Xử lý được nhiều trường hợp dữ liệu khác nhau
* Đảm bảo tính ổn định khi gặp dữ liệu sai

---

## 🧾 Kết luận

Qua bài thực hành này, đã:

* Nắm được cách thiết kế test case theo kiểm thử hộp đen
* Hiểu rõ vai trò của kiểm thử trong phát triển phần mềm
* Áp dụng kiểm thử vào các bài toán cơ bản

---

## 👨‍💻 Thông tin sinh viên

* Họ tên: Nguyễn Tất Hoàng Hà
* MSSV: 23010033
