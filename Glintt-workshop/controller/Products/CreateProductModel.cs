using System.ComponentModel.DataAnnotations;

namespace Glintt_workshop.controller.products
{
    public class CreateProductModel
    {
        [Required]
        [MinLength(5)]
        [MaxLength(5)]
        public string Code { get; set; }

        [Required]
        public string Name { get; set; }
        public string Description { get; set; }

        [Required]
        public decimal Price { get; set; }
    }


}
