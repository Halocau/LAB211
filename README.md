# LAB211
+ Cú pháp của khối lệnh try-catch
try {
    // code có thể ném ra ngoại lệ
} catch(Exception_class_Name ex) {
    // code xử lý ngoại lệ
}

try{
// ý nói rằng đây là đoạn code có thể xảy ra lỗi
} catch(Exception e) {
// ý nói rằng , nếu trên thằng try có lỗi thì chạy xuống thằng catch, 
//chính là tao, tao sẽ xử lý cho mày. tao là người giải quyết vấn đề cho mày. OK?
} finally {
// đây là khối luôn luôn được thực thi khi chạy chương trình cho dù có lỗi hay không
}

+ Cú pháp của khối lệnh try-finally
try {
// code có thể ném ra ngoại lệ
} finally {
// code trong khối này luôn được thực thi
}

try{
// ý nói rằng đây là đoạn code có thể xảy ra lỗi
} catch(Exception e) {
// ý nói rằng , nếu trên thằng try có lỗi thì chạy xuống thằng catch, 
//chính là tao, tao sẽ xử lý cho mày. tao là người giải quyết vấn đề cho mày. OK?
} finally {
// đây là khối luôn luôn được thực thi khi chạy chương trình cho dù có lỗi hay không
}

+ Cú pháp của khối lệnh try-catch-finally
try {
    // code có thể ném ra ngoại lệ
} catch(Exception_class_Name_1 ex) {
    // code xử lý ngoại lệ 1
} catch(Exception_class_Name_2 ex) {
    // code xử lý ngoại lệ 2
} catch(Exception_class_Name_n ex) {
    // code xử lý ngoại lệ n
} finally {
    // code trong khối này luôn được thực thi
}
