package model;

import java.time.LocalDateTime;

/**
 *

 CREATE TABLE todos (
 ID BIGINT PRIMARY KEY AUTO_INCREMENT,
 created_at DATETIME NOT NULL DEFAULT NOW(),
 updated_at DATETIME,
 titolo VARCHAR(512) NOT NULL,
 completato TINYINT NOT NULL DEFAULT 0
 );
 */

public class ToDo {
        private Integer id;

        private LocalDateTime createdAt;

        private LocalDateTime updatedAt;

        private String titolo;

        private boolean completato;

        public ToDo(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String titolo, boolean completato) {
                this.id = id;
                this.createdAt = createdAt;
                this.updatedAt = updatedAt;
                this.titolo = titolo;
                this.completato = completato;
        }

        public ToDo(String titolo) {
                this.titolo = titolo;
        }

        public Integer getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public LocalDateTime getCreatedAt() {
                return createdAt;
        }

        public void setCreatedAt(LocalDateTime createdAt) {
                this.createdAt = createdAt;
        }

        public LocalDateTime getUpdatedAt() {
                return updatedAt;
        }

        public void setUpdatedAt(LocalDateTime updatedAt) {
                this.updatedAt = updatedAt;
        }

        public String getTitolo() {
                return titolo;
        }

        public void setTitolo(String titolo) {
                this.titolo = titolo;
        }

        public boolean isCompletato() {
                return completato;
        }

        public void setCompletato(boolean completato) {
                this.completato = completato;
        }

        @Override
        public String toString() {
                return "Todo [id=" + id + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", titolo=" + titolo
                        + ", completato=" + completato + "]";
        }


}