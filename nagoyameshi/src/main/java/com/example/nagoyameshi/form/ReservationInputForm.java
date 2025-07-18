package com.example.nagoyameshi.form;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ReservationInputForm {
    @NotBlank(message = "予約日を選択してください。")
    private String fromCheckinDate;
    
    @NotBlank(message = "予約時間を選択してください。")
    private String reservationTime;
    
    @NotNull(message = "人数を入力してください。")
    @Min(value = 1, message = "人数は1人以上に設定してください。")
    private Integer numberOfPeople; 

    // チェックイン日を取得する
    public LocalDate getCheckinDate() {
    	String checkinDate = getFromCheckinDate();
        return LocalDate.parse(checkinDate);
    }
    
    public LocalTime getReservationTimeAsTime() {
        return LocalTime.parse(this.reservationTime);
    }

}