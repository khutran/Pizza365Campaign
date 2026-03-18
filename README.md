# Pizza365 Campaign - Frontend Standalone

Dự án này là giao diện người dùng (Frontend) của hệ thống Pizza365, được tách ra thành project riêng biệt để dễ dàng quản lý và triển khai.

## Cài đặt và Chạy
1. **Yêu cầu**: Đảm bảo 3 dịch vụ Backend sau đang chạy:
    - `DailyCampaign` (Port 8088)
    - `ComboMenuAPI` (Port 8082)
    - `DrinkAPI` (Port 8083)
2. **Cổng chạy**: Project này chạy tại cổng **8081**.
3. **Cách khởi động**:
   ```bash
   mvn spring-boot:run
   ```
4. **Truy cập**: [http://localhost:8081/](http://localhost:8081/)

## Chức năng chính
- Hiển thị banner khuyến mại theo ngày từ `DailyCampaign`.
- Hiển thị thông tin bảng giá combo Pizza từ `ComboMenuAPI`.
- Tự động tải danh sách đồ uống từ `DrinkAPI`.
- Form đặt hàng tích hợp đầy đủ AJAX kết nối server.

## API Endpoints

### Drink API
- **Endpoint**: `GET /drinks`
- **Controller**: `CDrinkController`
- **Output**: Returns an `ArrayList<CDrink>` containing the list of available drinks.
- **Sample URL**: [http://localhost:8080/drinks](http://localhost:8080/drinks)

## Triển khai (Deployment)
- Đóng gói WAR: `mvn clean package -DskipTests`
- File kết quả: `target/drinks.war` (hoặc `target/pizza365campaign.war`)
