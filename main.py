import math

# 1. Chu vi hình chữ nhật
def chu_vi(a, b):
    if a <= 0 or b <= 0:
        return "Dữ liệu không hợp lệ"
    return 2 * (a + b)

# 2. Diện tích hình chữ nhật
def dien_tich(a, b):
    if a <= 0 or b <= 0:
        return "Dữ liệu không hợp lệ"
    return a * b

# 3. Giải phương trình bậc 2
def giai_pt_bac2(a, b, c):
    if a == 0:
        return "Không phải PT bậc 2"
    delta = b*b - 4*a*c
    if delta < 0:
        return "Vô nghiệm"
    elif delta == 0:
        x = -b / (2*a)
        return f"Nghiệm kép: {x}"
    else:
        x1 = (-b + math.sqrt(delta)) / (2*a)
        x2 = (-b - math.sqrt(delta)) / (2*a)
        return f"2 nghiệm: {x1}, {x2}"

# 4. Số ngày trong tháng
def so_ngay(thang, nam):
    if thang < 1 or thang > 12:
        return "Tháng không hợp lệ"
    if thang == 2:
        if (nam % 4 == 0 and nam % 100 != 0) or (nam % 400 == 0):
            return 29
        return 28
    if thang in [4, 6, 9, 11]:
        return 30
    return 31

# 5. Kiểm tra số nguyên tố
def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

# 6. Tổng S = 1 - 2 + 3 - 4 + ... + n
def tong_so(n):
    if n < 1:
        return "Không hợp lệ"
    s = 0
    for i in range(1, n+1):
        s += i if i % 2 != 0 else -i
    return s

# 7. UCLN
def ucln(a, b):
    while b:
        a, b = b, a % b
    return abs(a)

# 8. Tổng giai thừa
def tong_giai_thua(n):
    if n < 0:
        return "Không hợp lệ"
    s = 0
    gt = 1
    for i in range(1, n+1):
        gt *= i
        s += gt
    return s
