package com.solvd.patterns.builder;

import org.joda.time.LocalDate;

public class Page {

    private String title;
    private String description;
    private String url;
    private LocalDate creationDate;
    private Integer size;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public LocalDate getCreation_date() {
        return creationDate;
    }

    public Integer getSize() {
        return size;
    }

    public static Builder builder() {return new Builder(new Page());}

    public static class Builder {

        private final Page page;

        private Builder(Page page) {
            this.page = page;
        }

        public Builder title(String title) {
            page.title = title;
            return this;
        }

        public Builder description(String description) {
            page.description = description;
            return this;
        }

        public Builder url(String url) {
            page.url = url;
            return this;
        }

        public Builder creationDate(LocalDate creationDate) {
            page.creationDate = creationDate;
            return this;
        }

        public Builder size(Integer size) {
            page.size = size;
            return this;
        }

        public Page build() {
            return page;
        }
    }
}
