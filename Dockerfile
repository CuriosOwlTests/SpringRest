FROM gradle:8.5-jdk21
WORKDIR /app
COPY . .
EXPOSE 8080
CMD ["gradle", "bootRun"]