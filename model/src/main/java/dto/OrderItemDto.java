package dto;

import lombok.Data;

@Data
public class OrderItemDto {
    private int quantity;
    private ItemDto item;
}
