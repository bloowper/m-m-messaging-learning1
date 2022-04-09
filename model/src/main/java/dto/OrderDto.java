package dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderDto {
    private String id;
    private List<OrderItemDto> items;
}
