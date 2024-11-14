
    function showSection(sectionId) {
        // Cache toutes les sections
        const sections = document.querySelectorAll('.content-section');
        sections.forEach(section => {
        section.style.display = 'none';
        });

        // Affiche la section sélectionnée
        const selectedSection = document.getElementById(sectionId);
        if (selectedSection) {
        selectedSection.style.display = 'block';
        }
    }

    function moveSlide(button, direction) {
        const slider = button.closest('.slider');
        const slides = slider.querySelectorAll('.slide');
        let activeIndex = Array.from(slides).findIndex(slide => slide.classList.contains('active'));
        slides[activeIndex].classList.remove('active');
        activeIndex = (activeIndex + direction + slides.length) % slides.length;
        slides[activeIndex].classList.add('active');
    }
