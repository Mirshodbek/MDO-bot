theme: /

    state: Start
        q!: $regex</start>
        script:
            // 1. User ID ni olish
            var userId = $request.channelUserId || $request.data.user.id;
            
            // 2. Ssilkani yasash
            var myUrl = "https://cabinet.kuber-stage.moydomonline.ru/?user_id=" + userId;
            
            // 3. Javob matni
            $reactions.answer("Assalomu alaykum! Kabinetga kirish uchun tugmani bosing:");
            
            // 4. Tugmani chiqarish
            $reactions.inlineButtons({
                "text": "🚀 Kabinetga kirish",
                "web_app": myUrl
            });

    state: CatchAll
        q!: *
        a: Iltimos, boshlash uchun /start buyrug'ini bosing.