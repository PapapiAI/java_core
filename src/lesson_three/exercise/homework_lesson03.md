# Bài tập 1: Kiểm tra số chính phương

## Đề bài:
> Kiểm tra 1 số nguyên dương x có phải là số chính phương hay không?
> * Định nghĩa số chính phương: Là số mà kết quả khai căn bậc 2 của nó là 1 số nguyên. vd: 0, 1, 4, 9, 16, 25, 36 ...

### Hướng dẫn các bước thực hiện

* Bước 1: Nhập một số nguyên dương x từ bàn phím
* Bước 2: Tính căn bậc hai của x bằng Math.sqrt(x) và lưu kết quả vào biến squareRoot
* Bước 3: Kiểm tra nếu squareRoot là số nguyên (có phần thập phân bằng 0, tức squareRoot % 1 == 0), thì x là số chính phương. Ngược lại, x không phải là số chính phương
* Bước 4: In ra thông báo tương ứng với kết quả kiểm tra ở Bước 3

---

# Bài tập 2: Kiểm tra và tìm ngày kế tiếp, ngày trước đó

## Đề bài:
> * Nhập vào thông tin 1 ngày (ngày – tháng – năm). 
> * Kiểm tra ngày có hợp lệ hay không? 
> * Nếu hợp lệ hãy tìm ra ngày kế tiếp (ngày – tháng – năm) & ngày trước đó (ngày – tháng – năm)

### Hướng dẫn các bước thực hiện

* Bước 1: Nhập vào ngày, tháng, năm từ bàn phím
* Bước 2: Kiểm tra xem ngày, tháng, năm nhập vào có hợp lệ hay không. Cần xác định số ngày tối đa của mỗi tháng (lưu ý tháng 2 trong năm nhuận), và xem xét liệu ngày nhập vào có vượt quá số ngày tối đa đó hay không
* Bước 3: Nếu ngày, tháng, năm hợp lệ, tìm ngày kế tiếp và ngày trước đó
  * Để tìm ngày kế tiếp, có thể tăng ngày lên 1
    * Nếu ngày vượt quá số ngày tối đa của tháng, đặt lại ngày về 1 và tăng tháng lên 1
    * Nếu tháng vượt quá 12, đặt lại tháng về 1 và tăng năm lên 1
  * Để tìm ngày trước đó, có thể giảm ngày đi 1
    * Nếu ngày nhỏ hơn 1, đặt ngày về ngày cuối của tháng trước và giảm tháng đi 1
    * Nếu tháng nhỏ hơn 1, đặt tháng về 12 và giảm năm đi 1
* Bước 4: In ngày kế tiếp và ngày trước đó ra màn hình console