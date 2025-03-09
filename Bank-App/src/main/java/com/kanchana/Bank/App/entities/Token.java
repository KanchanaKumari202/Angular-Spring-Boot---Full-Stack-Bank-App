package com.kanchana.Bank.App.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tokens")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Token {

    @Id
    @GeneratedValue
    @Column(name = "token_id")
    private Integer id;

    @Column(unique = true)
    private String token;

    private LocalDateTime createdAt;
    private LocalDateTime expiredAt;
    private LocalDateTime validatedAt;
}
