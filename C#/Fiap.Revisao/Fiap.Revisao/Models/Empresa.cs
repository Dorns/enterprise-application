using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace Fiap.Revisao.Models
{
    public class Empresa
    {
        public int EmpresaId { get; set; }

        [Required]
        [Display(Name ="CNPJ")]
        public int Cnpj { get; set; }

        [Required]
        [StringLength(200, ErrorMessage = "Máximo de 200 caracteres")]
        [Display(Name = "Razão Social")]
        public string RazaoSocial { get; set; }

        //Relacionamento
        public List<Funcionario> Funcionarios { get; set; }
    }
}